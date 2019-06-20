<!DOCTYPE html>
<html>
<head>
<style>
h1 {
  font-size: 65px;

}
.nav-item
{
color:white;
}
.bg-img {
  /* The image used */
  background-image: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)),url("img3.jpg");

  min-height:620px;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;

  /* Needed to position the navbar */
  position: relative;
}
.class1 .class2 {
  position: absolute;
  top: 0;
  background: rgb(0, 0, 0); /* Fallback color */
  background: rgba(0, 0, 0, 0); /* Black background with 0.5 opacity */
  width: 100%;
  padding: 5px;
}
</style>
<meta charset="ISO-8859-1">
<!-- Font Awesome -->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
<!-- Bootstrap core CSS -->

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<title>Mechanic Registration</title>
</head>
<body> 

<div class="row">
<div class="col-6">
<div class="class1">
<div class="bg-img"></div>
</div>

</div>
<div class="col-6">
<!-- Default form contact -->
<form class="text-center border border-light p-5 " action="MechanicRegister" method="post">

    <p class="h4 mb-4">Mechanic Registration</p>

    <!-- Name -->
    <input type="text" name="UserName" id="defaultContactFormName" class="form-control mb-4" placeholder="Mechanic Name">
    <input type="password"  name="Password" id="defaultContactFormEmail" class="form-control mb-4" placeholder="Password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required>
     <select class="browser-default custom-select mb-4" placeholder="Gender" name="gender">
        <option value="" selected disabled>Gender</option>
        <option value="1">Male</option>
         <option value="2">Female</option>
     
    </select>
    <input type="date" id="defaultContactFormName" name="Dateofbirth" class="form-control mb-4" placeholder="DOB" >
   <input type="text" id="defaultContactFormName" name="Phonenumber" class="form-control mb-4" placeholder="Contact Number">
     <input type="email" name="Email" id="defaultContactFormEmail" class="form-control mb-4" placeholder="E-mail">

    
    <input type="text" name="latitude" id="defaultContactFormName" class="form-control mb-4" placeholder="Latitude">
<input type="text" name="longitude" id="defaultContactFormName" class="form-control mb-4" placeholder="Longitude">
    <!-- Copy -->
    
     

    <!-- Send button -->
    <button class="btn btn-success btn-block" type="submit">Register</button>

</form>
<!-- Default form contact -->
</div>
</div>

</body>
</html>

