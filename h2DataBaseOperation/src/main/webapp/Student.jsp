<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align: center;">this is Student info</h1>
	<form action="student" style="text-align: center;">
		Student_id:<input type="text" name="sidl"><br>
		Student_Name:<input type="text" name="name"><br>
		Student_city:<input type="text" name="city"><br>
		Student_Deparment:<input type="text" name="deparment"><br>
		<input type="submit">
	</form>
	<form action="del">
	Student_id:<input type="number" name="id"><br>
	<input type="submit" value="delete">
	</form>
</body>
</html>