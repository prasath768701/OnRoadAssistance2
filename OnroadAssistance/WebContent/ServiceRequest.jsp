<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Location</title>
<style>
.bg-img {
  /* The image used */
  background-image: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)),url("map.jpg");

  min-height:620px;

  /* Center and scale the image nicely */
  background-position: left;
  background-repeat: no-repeat;
    background-size: cover;

  /* Needed to position the navbar */
  position: relative;
}
.CommentBox {
    width:400px;
    height:50px;
    color:black;
    margin:0 auto;
}


input[type="text"] {
    margin:20px auto;
}
.wrapper {
    text-align: center;
}

.button {
  background-color: white; /* Green */
  border: none;
  color: black;
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
h1 {
  color: white;
}
.button1 {
  background-color: grey; 
  color: black; 
  border: 2px solid white;
}

.button1:hover {
  background-color: white;
  color: grey;
}
</style>
</head>
<body
div class="bg-img"></div>

<form action="ServiceRequest"  method ="post">
<br><br><br><br>
<table align="center">>
       
              <tr>
   <td><h1> LOCATION </h1></td>
   <td> <input type="text" name="location" placeholder="Enter the location" /></td></tr>
   
              
       
<tr>
   <td><h1> LATITUDE</h1></td>
   <td> <input type="text" name="lattitude" placeholder="Enter the latitude"/></td></tr>



<tr>
   <td> <h1>LONGITUDE </h1></td>
   <td> <input type="text" name="longitude"placeholder="Enter the longitude" /></td></tr>
<tr>
  
   
  <center> <td> &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;<input type="Submit" value="Submit"  class="button button1"/></td></center></tr>
</table>
</form>
</body>
</html>
