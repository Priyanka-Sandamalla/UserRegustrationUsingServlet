<%@page import="java.util.List"%>
<%@page import="registration.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table{


}



</style>
</head>
<body>
	welcome user............
	<%--<%User u=(User)request.getAttribute("user"); --%>
	<%--<h2>Id: <%= u.getId() %></h2>--%>
	
	<%--<h2>Email: <%=u.getEmail() %></h2>--%>
	<%--<h2>PhoneNumber: <%=u.getPhone() %></h2>--%>
	<%--<h2>Age: <%=u.getAge() %></h2>--%>
	<%--<%  List<User> list = (List<User>)request.getAttribute("user");    --%>
	<%--<% 
    User u = (User) request.getAttribute("user"); 
    
	--%>
    <%-- <table border="2px">
        <tr>
            <th>ID</th>
            <th>FIRSTNAME</th>
            <th>LASTNAME</th>
            <th>EMAIL</th>
            <th>PHONENUMBER</th>
            <th>AGE</th>
            <th>GENDER</th>
        </tr>
        <tr>
            <td><%= u.getId() %></td>
            <td><%= u.getFirst_name() %></td>
            <td><%= u.getLast_name() %></td>
            <td><%= u.getEmail() %></td>
            <td><%= u.getPhone() %></td>
            <td><%= u.getAge() %></td>
            <td><%= u.getGender() %></td>
        </tr>
    </table>
    --%>
    
    
    
    <%List<User> list=(List<User>)request.getAttribute("userList") ;%>
    
     <table border="2px" >
        <tr>
            <th>ID</th>
            <th>FIRSTNAME</th>
            <th>LASTNAME</th>
            <th>EMAIL</th>
            <th>PHONENUMBER</th>
            <th>AGE</th>
            <th>GENDER</th>
            <th>UPDATE</th>
            <th>DELETE</th>
        </tr>
        <%for(User u1:list){ %>
        <tr>
            <td><%= u1.getId() %></td>
            <td><%= u1.getFirst_name() %></td>
            <td><%= u1.getLast_name() %></td>
            <td><%= u1.getEmail() %></td>
            <td><%= u1.getPhone() %></td>
            <td><%= u1.getAge() %></td>
            <td><%= u1.getGender() %></td>
            <td><button><a href="edit?id=<%= u1.getId() %>">update</a></button></td>
            <td><button><a href="delete?id=<%= u1.getId() %>">delete</a></button></td>
            
        </tr>
        <%} %>
    </table>
   

</body>
</html>