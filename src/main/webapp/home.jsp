<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Homepage</title>
</head>
<body>
<H2>Choose CRUD operation:- 1 to insert, 2 to retrieve, 3 to update, 4 to delete and 5 to exit </H2>
	<form name="input" action="employee?choice=1" method="get">
		Enter choice: <input type="text" name="choice"> <input type="submit" value="Submit">
	</form>
</body>
</html>