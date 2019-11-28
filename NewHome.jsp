<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<style>
	body{
		 background-image: url("http://localhost:8080//mainforlogin/shoes-background-image.jfif");
		 color:white;
	}
	
	
	ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #555;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover:not(.active) {
  background-color: #111;
}

.active {
  background-color: #4CAF50;
}


.column {
  float: left;
  width: 50%;
  padding: 10px;
  height: 300px; /* Should be removed. Only for demonstration */
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

* {
  box-sizing: border-box;
}



</style>
<body>
	
<ul>
  <li><a class="active" href="#home">Home</a></li>
  <li><a href="#news">News</a></li>
  <li><a href="#contact">Contact</a></li>
  <li><a href="#about">About</a></li>
</ul>

<h1>Welcome</h1>

<div class="row">
  <div class="column">
    <h1 style="background-color:#4863A0">Product Variety</h1>
    <h3>Physical stores have a limited stock. They only keep those things which are common and most selling. There are many different reasons which affect the availability of different products. The local retailer also tries to sell their limited stock. While ShoppersStop showcases the variety from their stock and different stores. You can browse and select products as per your choice and latest trend.</p>
 </h3>
 
 <br>
 <br>
 
 <h1  style="background-color:#4863A0">Product Replacement and Refund</h1>
    <h3>Product replacement and refund is really simple with additional cost and time. Sometimes you need to change a product which doesn’t fulfill your expectation. ShoppersStop provides you product replacement warranty for a limited time period. In this period if you find the product has defect and malfunction then you can replace the product as per product replacement policy.</p>
  </h3>
 
  </div>
  
  
  <div class="column">
    <p style="font-family:MV Boli;text-align:center;margin-top:10%;"><font size="30">Find your perfect shoes...</font></p>  
  </div>
</div>
	
</body>
</html>