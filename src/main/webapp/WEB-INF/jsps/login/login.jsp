<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Login</h2>

<form action="login" method="post">
<input type="text" name="email" placeholder="Enter User Id " /><br/><br/>
<input type="password" name="password" placeholder="Enter Password " /><br/><br/>
<input type="submit" value="login" />

</form>
${msg}

</body>
</html>