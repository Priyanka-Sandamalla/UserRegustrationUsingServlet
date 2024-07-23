<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
<style type="text/css">
body{
font-style: Arial,sans-serif;
margin: 0;
padding: 0;
background-color: #f0f0f0;
}
#body{
background-image:  url("https://img.freepik.com/free-photo/workplace-with-blue-office-supplies_23-2147843328.jpg");
background-repeat: no-repeat;
background-position: center;
background-size:cover;
height: 100vh;
display: flex;
justify-content: center;
align-items: center;
}
#f1{
border: 2px solid;
height:700px;
width:600px;
background-color: darkblue;
position: absolute;
top: 0px;
left: 500px;
transform:translateX(50%);

}
#f1 input[type="text"],
#f1 input[type="text"],
#f1 input[type="email"],
#f1 input[type="password"],
#f1 input[type="number"],
#f1 input[type="number"],
#f1 input[type="text"]{
width: 90%;
padding: 10px;
margin: 10px 0;
border:none;
border-radius: 5px;
font-size: 16px;
text-align: center;
}
#f1 label{
font-size: 20px;
color: white;
}
#f1 button{
	width: 100%;
	padding: 10px;
	background-color: red;
	border: none;
	border-radius: 5px;
	font-size: 18px;
	color: white;
	cursor: pointer;
	transition:background-color o.3s;

}
#f1 button:hover {
    background-color: darkred;
}
#f2{

position: absolute;
left: 150px;
top:330px;
font-size: 50px;

animation: demo 1s forward;

 

}
@keyframes demo{
 0%{
 opacity:1;
 }
 
}
</style>
</head>
<body id="body">
	<h1 id="f2" name="demo">WELCOME TO...... <br> REGISTRATION FORM</h1>
	<center>
	<form action="registration" id="f1">
		<label>Enter your First Name:</label><input type="text" name="fn" placeholder="enter ur first name"> <br><br>
		<label>Enter your Last Name :</label><input type="text" name="ln" placeholder="enter ur last name"> <br><br>
		<label>Enter your Email :</label><input type="email" name="email" placeholder="enter ur email"><br><br>
		<label>Enter your Password :</label><input type="password" name="pswd" placeholder="enter ur password"><br><br>
		<label>Enter your Phone Number :</label><input type="number" name="phone" placeholder="enter ur phone number"><br><br>
		<label>Enter your Age :</label><input type="number" name="age" placeholder="enter ur age"><br><br>
		<label>Enter your Gender :</label><input type="text" name="gender" placeholder="enter ur gender"><br><br>
		
		<button >SignUp</button>	
	</form>
	</center>
</body>
</html>