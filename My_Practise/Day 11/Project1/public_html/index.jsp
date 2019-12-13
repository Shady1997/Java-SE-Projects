<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1256" import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1256"/>
        <title>index</title>
    </head>
    <body>
        <p>Employee Page</p>
        <table border="2">
            <tr>
                <td>ID</td>
                <td>Name</td>
                <td>Salary</td>
              
            </tr>
             
           <c:forEach items="${requestScope.employeesData}" var="row">
             <tr>
                <td>
                        <c:out value="${row.id}"/>
                    </td>
                <td>
                  <c:out value=="${row.name}"/>
                        
                    </td>
                <td>
                        <c:out value="${row.salary}"/>
                    </td>
            </tr>
            </c:forEach>
        </table>
    </body>
</html>