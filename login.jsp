<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yahoo!!! from JSP</title>
</head>
<body> 
<font color = "red"><p>${loginError}</p></font>
	<form action="/login" method = "post">
		Enter your name <input type = "text" name = "name"/> <br> <br>
		Password: <input type = "password" name = "password"> <br><br>
		<input type="submit" value = "login"/> 
	</form>
</body>
</html>
