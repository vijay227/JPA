<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Page</h1>
	<center>
		<h2>Signup Details</h2>
		<form action="addstud" method="post">
			<br />Username:<input type="number" name="id"> <br />Password:<input
				type="text" name="name"> <br /> <input type="submit"
				value="Submit">
		</form>
	</center>
	<center>
		<h2>second form for getting details</h2>
		<form action="getstud" method="post">
			<br />Username:<input type="number" name="id"> <br /> <input
				type="submit" value="Submit">
		</form>
	</center>
</body>
</html>