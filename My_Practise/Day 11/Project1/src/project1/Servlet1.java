package project1;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet1 extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1256";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        String deptId=request.getParameter("getId");
        try{  
        //step1 load the driver class  
        Class.forName("oracle.jdbc.driver.OracleDriver");  
          
        //step2 create  the connection object  
        Connection con=DriverManager.getConnection(  
        "jdbc:oracle:thin:@localhost:1521:xe","hr","hr");  
          
        //step3 create the statement object  
        Statement stmt=con.createStatement();  
          
        //step4 execute query  
        ResultSet rs=stmt.executeQuery("select * from employees,departments where employees.department_id=departments.department_id");    
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Employee emp;
                        while (rs.next()) {
                            emp = new Employee();
                            emp.setId(rs.getInt("employee_id"));
                            emp.setName(rs.getString("first_name") + " " + rs.getString("last_name"));
                            emp.setSalary(rs.getFloat("salary"));
                            employees.add(emp);
                        }
                        rs.close();
                        stmt.close();
                        con.close();

                        request.setAttribute("employeesData", employees);
                        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
                        dispatcher.forward(request, response);
 
        //step5 close the connection object  
        con.close();  
          
        }catch(Exception e){ e.printStackTrace();}  
          
        }  
        
//        out.println("<html>");
//        out.println("<head><title>Servlet1</title></head>");
//        out.println("<body>");
//        out.println("<p>The servlet has received a GET. This is the reply.</p>");
//        out.println("</body></html>");
//        out.close();
    }

