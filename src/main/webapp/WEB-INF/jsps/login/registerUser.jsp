<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>

<h2 style="text-align:center;color:green;"  >User Registration</h2>

<form action="registerUser" method="post">
<input type="text" name="firstName" placeholder="Enter First Name " required/><br/><br/>
<input type="text" name="lastName" placeholder="Enter Last Name  " required/><br/><br/>
<input type="text" name="email" placeholder="Enter Email " required/><br/><br/>
<input type="password" name="password" placeholder="Enter Password " required/><br/><br/>
<input type="submit" value="register"/>
</form>

<h3 style="color:red;">${msg }</h3>

<a href="showLogin">Login</a>
</body>
</html>