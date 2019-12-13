package depid;

import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DepartmentId extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1256";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException{
        response.setContentType(CONTENT_TYPE);
        int id = Integer.parseInt(request.getParameter("departmentID"));


        try {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
            System.out.println("*************111111111");
            Statement st = conn.createStatement();
            String sql = "select * from EMPLOYEES where DEPARTMENT_ID = " + id + "";
            System.out.println("*************22222222");

            ResultSet rs = st.executeQuery(sql);
            ArrayList<EmployeeInfo> employees = new ArrayList<EmployeeInfo>();
            EmployeeInfo emp;

            while (rs.next()) {
                emp = new EmployeeInfo();
                emp.setEmployeeID(rs.getInt("EMPLOYEE_ID"));
                emp.setFirstName(rs.getString("FIRST_NAME"));
                emp.setLastName(rs.getString("LAST_NAME"));
                emp.setEmail(rs.getString("EMAIL"));
                emp.setSalary(rs.getFloat("SALARY"));
                
                employees.add(emp);
            }
            System.out.println("*************33333333");

            rs.close();
            st.close();
            conn.close();
            
            System.out.println(employees);

            request.setAttribute("employeesData", employees);
            
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Employee.jsp");
            dispatcher.forward(request, response);


        }catch (SQLException sqle) {
            // TODO: Add catch code
            sqle.printStackTrace();
        }
    }
}
