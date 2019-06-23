<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Simple Tag</title>
<%@ taglib uri="simpleTagUri" prefix="cTag"%>
</head>
<body>
	<h2>Number Formatting Example</h2>
	<cTag:formatNumber number="100050.574" format="#,###.00" />
	<br>
	<cTag:formatNumber number="1234.567" format="$# ###.00" />
</body>
</html>