<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Rating</title>
<style>
div.stars {
  width: 270px;
  display: inline-block;
}

input.star { display: none; }

label.star {
  float: right;
  padding: 10px;
  font-size: 36px;
  color: blue;/*outline star*/
  transition: all .2s;
}

input.star:checked ~ label.star:before {
  content: '\f005';
  color: blue;
  transition: all .25s;
}
body {
  background-image: url("img1.jpg");
  background-repeat: no-repeat;

 background-size: 1400px 700px;

}

input.star-5:checked ~ label.star:before {
  color: blue;
  text-shadow: 0 0 20px #952;
}

input.star-1:checked ~ label.star:before { color: blue; }

label.star:hover { transform: rotate(-15deg) scale(1.3); }

label.star:before {
  content: '\f006';
  font-family: FontAwesome;
}
</style>
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
</head>
<body>
<center>
<h1>Enter Your Rating</h1>
<br><br><br><br><br><div class="stars">
  <form action="RatingService" method="get">
    <input class="star star-5" id="star-5" type="radio" name="star" value="5"/>
    <label class="star star-5" for="star-5"></label>
    <input class="star star-4" id="star-4" type="radio" name="star" value="4"/>
    <label class="star star-4" for="star-4"></label>
    <input class="star star-3" id="star-3" type="radio" name="star" value="3"/>
    <label class="star star-3" for="star-3"></label>
    <input class="star star-2" id="star-2" type="radio" name="star" value="2"/>
    <label class="star star-2" for="star-2"></label>
    <input class="star star-1" id="star-1" type="radio" name="star" value="1"/>

    <label class="star star-1" for="star-1"></label>
    <input type="submit" value="submit">
  </form>
</div>
</center>
</body>
</html>
