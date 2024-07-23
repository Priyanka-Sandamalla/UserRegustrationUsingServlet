<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<%-- <link rel="stylesheet" href="./login.css"> --%>


<style type="text/css">
/* Global styles */
body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color: #f0f0f0;
}

#body {
    background-image: url("https://st4.depositphotos.com/1001026/28350/i/450/depositphotos_283502530-stock-photo-abstract-architecture-background-3d-rendering.jpg");
    background-repeat: no-repeat;
    background-size: cover;
    background-position: center;
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
}

#f1 {
    background-color: darkblue; 
    width: 400px;
    padding: 30px;
    border-radius: 17px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
    color: white;
    position: absolute;
    left: 80px;
    top:200px;
}


#f1 h4 {
    margin: 15px 0;
}

#f1 input[type="email"],
#f1 input[type="password"] {
    width: 100%;
    padding: 10px;
    margin: 10px 0;
    border: none;
    border-radius: 5px;
    font-size: 16px;
text-align: center;
}

#f1 button {

    width: 100%;
    padding: 10px;
    background-color: red;
    border: none;
    border-radius: 5px;
    font-size: 18px;
    color: white;
    cursor: pointer;
    transition: background-color 0.3s;
}

#f1 button:hover {
    background-color: darkred;
}

/* Error message */
h3 {
    color: red;
    text-align: center;
}
#f2{
position: absolute;
top: 70px;
left: 200px;
font-size: 50px;
}
</style>
</head>
<body id="body">
	<h3 style="color: red"><%String s=(String)request.getAttribute("msg");
	if(s!=null){
		
	
	%>
	<%=s %>
	<%} %>
	</h3>
	<h1 id="f2">LOGIN</h1>
	<center>
	<form action="login" method="post" id="f1">
	<h4>Enter your email:</h4><input  type="email" name="email" placeholder="enter ur correct email"> <br><br>
	<h4>Enter your password:</h4><input type="password" name="pswd" placeholder="enter ur correct password"><br><br>
	<button>LOGIN</button>
	</form>
	</center>
</body>
</html>