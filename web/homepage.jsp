<%@ page import="model.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="db.DBManager" %><%--
  Created by IntelliJ IDEA.
  User: zhansayakulbaeva
  Date: 30.01.2024
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/addUser" method="post">
    NAME: <input type="text" name="userName">
    SURNAME: <input type="text" name="userSurname">
    <button>SUBMIT</button>
</form>

<%
    ArrayList<User> users = DBManager.getUsers();
    for (int i = 0; i < users.size(); i++) {
%>
<h1 style="color: red"><%=users.get(i).getName()+" "+users.get(i).getSurname()%></h1>
<%}%>

</body>
</html>
