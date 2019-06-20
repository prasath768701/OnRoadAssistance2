<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mechanic Home Page</title>
<style>

body {
  background-image: url("mech_re.jpg");
  background-repeat: no-repeat;

 background-size: 1400px 700px;

}

.button {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
</style>
</head>
<body>
<form action="MechanicChecksRequest" method="post">
<br><br><br><br><br><br><br><br><br>
<center><input type="submit" class="button" value="Check for Requests"></center>
</form>
</body>
</html>