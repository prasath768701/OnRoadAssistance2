<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mechanic List</title>
<style>
body {
  background-image: url("mech_list.jpg");
  background-repeat: no-repeat;

 background-size: 1400px 700px;

}
</style>
</head>
<body>

<center><h1>Mechanics List</h1></center>  
<form action="ServiceRequest?action=update" method="get">
<input type ="hidden" name ="action" value ="update"/>
<input type ="hidden" name ="request_id" value ="${request_id}"/>

<table border="1" width="90%">  
<tr><th>MechId</th><th>name</th><th>Contact</th><th>Email</th>  
<th>Select mechanic</th></tr>  
<c:forEach items="${mechanics}" var="u">  
<tr><td>${u.getMech_id()}</td><td>${u.getMech_name()}</td><td>${u.getMech_contactno()}</td><td>${u.getMech_emailId()}</td>
 <td><center><input type="radio" name="mechid" value="${u.getMech_id()}"></center></td>  
</tr>  
</c:forEach>  

</table> 
<center>
<br>

<input type="submit" value="submit"></td>
</center>
</form>



</body>
</html>