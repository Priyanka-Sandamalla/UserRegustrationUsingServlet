<%@page import="registration.dto.User"%>
<%@page import="registration.dao.UserCrud"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% User u = (User) request.getAttribute("user"); %>
	<form action="update" method="post">
		Enter your id :<input type="number" name="id" value="<%= u.getId() %>" placeholder="enter ur id"><br><br>
		Enter your First Name:<input type="text" name="fn" value="<%=u.getFirst_name() %>" placeholder="enter ur first name"> <br><br>
		Enter your Last Name :<input type="text" name="ln" value="<%= u.getLast_name() %>" placeholder="enter ur last name"> <br><br>
		Enter your Email :<input type="text" name="email" value="<%= u.getEmail() %>" placeholder="enter ur email"><br><br>
		Enter your Phone Number :<input type="number" name="phone"  value="<%= u.getPhone() %>" placeholder="enter ur phone number"><br><br>
		Enter your Age :<input type="number" name="age" value="<%= u.getAge() %>" placeholder="enter ur age"><br><br>
		Enter your Gender :<input type="text" name="gender" value="<%= u.getGender() %>" placeholder="enter ur gender"><br><br>
		
		<button>edit</button>
	</form>
</body>
</html>