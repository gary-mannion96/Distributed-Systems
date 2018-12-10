<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Update Order</h1>

	<form action="webapi/myresource/UpdateOrder" method="post">
		<p>
			Name : <input type="number" name="name" />
		</p>
		<p>
			Car Reg : <input type="number" name="carreg" />
		</p>
		<p>
			End Date : <input type="text" name="enddate" />
		</p>
		<input type="submit" value="Update" />
	</form>
</body>
</html>