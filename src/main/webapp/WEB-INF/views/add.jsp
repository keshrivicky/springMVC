<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TEST JSP FILE</title>
<script type="text/javascript">
<link href = "https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">  
<script src = "https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js">  

</script>
</head>
<body>
<h1><b>TEST PAGE LOAD SUCCESSFULLY</b></h1>
 <h1>${myname }</h1> 
 

</body>
</html --%>

<!DOCTYPE html>  
<html lang = "en">  
<head>  
<title> Bootstrap 5 Example </title>  
<meta charset = "utf-8">  
<meta name = "viewport" content = "width=device-width, initial-scale = 1">  
<link href = "https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">  
<script src = "https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"> </script>  
<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
</head>  
<body>  

  <div class="container">
        <h1> Create New Employee </h1>
        <form id="addcustomerform" action="addcustomerform">
            <div class="form-group">
                <label>Employee Name:</label>
                <input type="text" name="txtEmployeeName" id="txtEmployeeName" class="form-control" value="${txtEmployeeName}" required="">
            </div>
            <div class="form-group">
                <label>Employee Address:</label>
                <textarea class="form-control" name="txtAddress" id="txtAddress"></textarea>
            </div>
            <div class="form-group">
                <label>PostalCode:</label>
                <input type="text" name="txtPostalCode" id="txtPostalCode" class="form-control" value="" required="">
            </div>
            <button type="submit" id="btnaddEmployee" class="btn btn-primary save-btn">add Customer</button>

        </form>
        <br />

    </div> 
</body>  
</html>  