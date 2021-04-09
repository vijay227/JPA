<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	welcome ${obj.id}, ${obj.name}
	<h1>Login Page</h1>
	<center>
		<h2>Signup Details</h2>
		<form action="addstud" method="post">
			<br />Username:<input type="number" name="id"> <br />Password:<input
				type="text" name="name"> <br /> 
		</form>
	</center>
</body>
</html>