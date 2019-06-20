<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accept or Reject</title>
<style>
body {
  background-image: url("acc_reg.jpg");
  background-repeat: no-repeat;

 background-size: 1400px 700px;

}

</style>
</head>
<body>
<center>
<form action="DecisionService"  method ="post">

<table>


<tr>
<br><br><br><br><br><br>
<h1> ACCEPT OR REJECT THE CUSTOMER REQUEST</h1>
       <td><input type="submit" name="request" value="Accept"></td>
       <td><input type="submit" name="request1" value="Reject"></td>
</tr>


</table>
</form>
</center>
</body>
</html>