<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="NewFile1.css">
</head>
<body>
<div class="map">
  <img src="https://cdn-images-1.medium.com/max/1600/0*iRgiB6y8atMchG0o.jpg" alt="" />
  <div id="pin-1" class="box">
    <div class="pin-text">
      <h3>Mechanic location</h3>
    </div>
  </div>
  <div id="pin-2" class="box">
    <div class="pin-text">
      <h3>Customer location</h3>
    </div>
  </div>
</div>
<title>Real Time Navigation</title>
<body>
<br><center>
<% float distance=100f;
   float speed=40f;
   float time = distance/speed;
   
   out.println("Mechanic is " +time +" Minutes away..");
   
   %>
   </center>
   <br>
   <a href="Rating.jsp">Complete Service</a>
</body>
</html>


























