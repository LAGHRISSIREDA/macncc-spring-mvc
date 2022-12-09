<%--
  Created by IntelliJ IDEA.
  User: laghr
  Date: 12/4/2022
  Time: 1:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/save" method="post">

    <label for="email">email : </label>
    <input type="email" id="email" name="email" placeholder="enter your email here"><br>
    <label for="password">password : </label>
    <input type="password" id="password" placeholder="enter your password here"><br>
    <input type="submit" value="login">
</form>

</body>
</html>
