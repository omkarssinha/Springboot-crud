<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<H2>Enter new Employee details</H2>
	<form name="input" action="continueInsert" method="post">
		ID: <input type="number" name="id"> name: <input type="text" name="name"> Gender: <input type="text" name="gender"> Dept: <input type="text" name="dept">  DOB: <input type="date" name="dob"> <input type="submit" value="Submit">
	</form>
</body>
</html>