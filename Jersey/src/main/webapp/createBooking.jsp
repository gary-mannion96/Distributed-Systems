<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Booking</title>
</head>
<body>
	<h2>Create a booking</h2>
	<form action="webapi/myresource/addOrder" method="POST">
		Name: <input type="text" name="name" /> <br /> 
		Start Date: <input type="text" name="start_date" /> <br /> 
		End date: <input type="text" name="end_date" /> <br /> 
		Car Make: <input type="text" name="carmake" /> <br /> 
		Car Reg: <input type="text" name="carreg" />    
		<input type="submit" value="Submit" />
	</form>

	<a href="index.jsp">Home</a>
</body>
</html>