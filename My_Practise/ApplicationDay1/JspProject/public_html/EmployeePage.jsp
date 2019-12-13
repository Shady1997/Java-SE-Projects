<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" import="java.util.List,java.util.Iterator,jspproject.Employee"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/webapp/myTaglib" prefix="myTaglib"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>EmployeePage</title>
    </head>
    <body>
        <p>Employee Page</p>
        <table border="2">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Salary</th>
                <th>Job</th>
            </tr>          
            <c:forEach items="${requestScope.employeesData}" var="row">
             <tr>
                <td>
                        <c:out value="${row.id}"/>
                    </td>
                <td>
                 <myTaglib:SayHelloTag name="${row.name}"/>
                        
                    </td>
                <td>
                        <c:out value="${row.salary}"/>
                    </td>
            </tr>
            </c:forEach><!--<%  
            List employees = (List)request.getAttribute("employeesData");
            Iterator empItr= employees.iterator();
            while(empItr.hasNext()){
            Employee emp = (Employee)empItr.next();           
            %>
            <tr>
                <td><%=emp.getId()%></td>
                <td><%=emp.getName()%></td>
                <td><%=emp.getSalary()%></td>
                <td>&nbsp;</td>
            </tr>
            <% } %>-->
        </table>
    </body>
</html>