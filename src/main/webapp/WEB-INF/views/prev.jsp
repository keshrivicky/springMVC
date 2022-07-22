<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page isELIgnored = "false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TEST JSP FILE</title>
</head>
<body>
<h1><b>TEST PAGE LOAD SUCCESSFULLY</b></h1>
<h1>${myname }</h1> 
<h1>${address }</h1> 
<form action="student" method="POST">
<label>ID:-</label> <input type=text name ="id" value ="" >
<br>
<label>name:-</label><input type=text name ="name" value ="" >
<br>
<label>age:-</label><input type=text name ="age" value ="" >
<br>
<label>dept:-</label><input type=text name ="dept" value ="" >
<br>
<input type="submit">
</form>
</body>
</html>