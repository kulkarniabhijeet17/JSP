<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="menuTag" uri="menus"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Classic Tag</title>
</head>
<body>
	<h2>Classic Nested Tag Communication Example</h2>
	<menuTag:Menu prefix="Out">
		<menuTag:MenuItem value="01" />
		<menuTag:MenuItem value="02" />
		<menuTag:MenuItem value="03" />
		<menuTag:MenuItem value="04" />
	</menuTag:Menu>
</body>
</html>