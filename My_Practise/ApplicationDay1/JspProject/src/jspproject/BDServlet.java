package jspproject;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "BDServlet", urlPatterns = { "/bdservlet" })
public class BDServlet extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=UTF-8";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //connect to DB
        try {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.205:1521:ORCL", "hr", "hr");
            Statement stmt = conn.createStatement();
            ResultSet rset = stmt.executeQuery("SELECT first_name, last_name, salary,employee_id  FROM employees");
            ArrayList<Employee> employees = new ArrayList<Employee>();
            Employee emp;
            while (rset.next()) {
                emp = new Employee();
                emp.setId(rset.getInt("employee_id"));
                emp.setName(rset.getString("first_name") + " " + rset.getString("last_name"));
                emp.setSalary(rset.getFloat("salary"));
                employees.add(emp);
            }
            rset.close();
            stmt.close();
            conn.close();

            request.setAttribute("employeesData", employees);
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/EmployeePage.jsp");
            dispatcher.forward(request, response);
        } catch (SQLException sqle) {
            // TODO: Add catch code
            sqle.printStackTrace();
        }
    }
}
