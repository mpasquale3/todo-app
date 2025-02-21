<%--
  Created by IntelliJ IDEA.
  User: kenna
  Date: 2/13/2025
  Time: 7:20 PM
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>To-Do List</title>
</head>
<body>
<h2>To-Do List</h2>
<form action="addTask" method="POST">
    <input type="text" name="description" required>
    <button type="submit">Add Task</button>
</form>
</body>
</html>
