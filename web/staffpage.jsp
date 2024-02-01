<%@ page import="java.util.ArrayList" %>
<%@ page import="model.Staff" %>
<%@ page import="db.DBManager" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table cellpadding="15px">
    <tr>
        <td>NAME</td>
        <td>SURNAME</td>
        <td>DEPARTMENT</td>
        <td>SALARY</td>
    </tr>
    <%
        ArrayList<Staff> allStaff = DBManager.getAllStaff();
        for (int i = 0; i < allStaff.size(); i++) {
    %>
        <tr>
            <td><%=allStaff.get(i).getName()%></td>
            <td><%=allStaff.get(i).getSurname()%></td>
            <td><%=allStaff.get(i).getDepartment()%></td>
            <td><%=allStaff.get(i).getSalary()%></td>
        </tr>
    <%}%>
</table>
</body>
</html>
