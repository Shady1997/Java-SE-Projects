<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1256"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1256"/>
    </head>
    <body>
        <table cellspacing="3" cellpadding="0" border="2" width="50%">
            <tr>
                <th width="25%">Employee ID</th>
                <th width="25%">Email</th>
                <th width="25%">First Name</th>
                <th width="25%">Last Name</th>
                <th width="25%">Salary</th>
            </tr>
             
            <c:forEach items="${requestScope.employeesData}" var="row">
                <tr>
                    <td>
                        <c:out value="${row.employeeID}"/>
                    </td>
                    <td>
                        <c:out value="${row.email}"/>
                    </td>
                    <td>
                        <c:out value="${row.firstName}"/>
                    </td>
                    <td>
                        <c:out value="${row.lastName}"/>
                    </td>
                    <td>
                        <c:out value="${row.salary}"/>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>