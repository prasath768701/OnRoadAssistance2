<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to App</title>


<style>
h1 {
  font-size: 65px;

}
h1 {
  text-align: center;
}


body {
  background-image: url("img1.jpg");
  background-repeat: no-repeat;
  background-position: right top;
  margin-right: 100px;
  background-attachment: fixed;
}
.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 16px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  -webkit-transition-duration: 0.4s; /* Safari */
  transition-duration: 0.4s;
  cursor: pointer;
}

.button1 {
  background-color: white; 
  color: black; 
  border: 2px solid #4CAF50;
}

.button1:hover {
  background-color: #4CAF50;
  color: white;
}

.button2 {
  background-color: white; 
  color: black; 
  border: 2px solid #008CBA;
}

.button2:hover {
  background-color: #008CBA;
  color: white;
}
.topright {
  position: absolute;
  top: 8px;
  right: 16px;
  font-size: 18px;
}

.topleft {
  position: absolute;
  top: 8px;
  left: 16px;
  font-size: 18px;
}

</style>
</head>

<body>
<br><br><br><br>

<center><<h1><P class="bold">On Road Assistance</P></h1></center>
<br><br><br>
<div >
  <a href="CustomerLogin.jsp">
  <button class="button button2 topleft">CUSTOMER</button></a>
  </div>

  <div >
  <a href="MechanicLogin.jsp">
  <button class="button button1 topright">MECHANIC</button></a>
  </div> 



</body>
</html>

