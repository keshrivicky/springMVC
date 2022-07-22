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
<h1><b>Sucess PAGE LOAD SUCCESSFULLY</b></h1>
<%-- <h1>${id}</h1>
<h1>${name}</h1> 
<h1>${age}</h1> 
<h1>${dept}</h1> --%>  

<%-- <h1>${student11.id}</h1>
<h1>${student11.name}</h1> 
<h1>${student11.age}</h1> 
<h1>${student11.dept}</h1>  --%>

<h1>${student.id}</h1>
<h1>${student.name}</h1> 
<h1>${student.age}</h1> 
<h1>${student.dept}</h1>  

</body>
</html>