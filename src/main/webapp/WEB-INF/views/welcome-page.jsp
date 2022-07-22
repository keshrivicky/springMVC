<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
  <%@ page isELIgnored = "false" %> 
<html>
<head>
</head>
<body>
  
    <hr />
  
    <form:form action="process-homepage" method="get" modelAttribute="nameInfo">
  
        <div align="center">
              
<p>
                <label for="name1">Enter First Name : </label>
                <form:input id="name1" path="firstName" />
            </p>
  
              
<p>
                <label for="name2">Enter Last Name : </label> 
                <form:input id="name2" path="lastName" />
            </p>
  
  
            <input type="submit" value="Bind Data" />
  
        </div>
  
    </form:form>
</body>
</html>