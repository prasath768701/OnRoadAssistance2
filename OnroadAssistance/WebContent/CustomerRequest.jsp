<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CusomerHomePage</title>
</head>
<style>
body {
  background-image: url("req_id.jpg");
  background-repeat: no-repeat;

background-size: 1400px 700px;

}
</style>
<body>
<form action="CustomerRequestCheck" method="post">
<br><br><br><br><br>
<center>Request Id <input type="text" name="requestid"></center>
<center><input type="submit" value="check status"></center>
<br>
<center><a href="ServiceRequest.jsp">Add Request</a></center>
<br>
<center><h1>List of Requests</h1></center>

<input type ="hidden" name ="action" value ="update"/>
<input type ="hidden" name ="request_id" value ="${request_id}"/>

<table border="1" width="90%">  
<tr><th>Request Id</th><th>Status</th>  
</tr>  
<c:forEach items="${requests}" var="u">  
<tr><td>${u.getRequest_id()}</td><td>${u.getStatus()}</td>
</tr>  
</c:forEach>  

</table> 
<center>

</form>
</body>
</html>
