package registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import registration.dao.UserCrud;
import registration.dto.User;
@WebServlet("/update")
public class Edit extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String idStr = req.getParameter("id");
	        String fn = req.getParameter("fn");
	        String ln = req.getParameter("ln");
	        String email = req.getParameter("email");
	        String pswd = req.getParameter("pswd");
	        String phoneStr = req.getParameter("phone");
	        String ageStr = req.getParameter("age");
	        String gender = req.getParameter("gender");

	       

	        int id = Integer.parseInt(idStr);
	        long phone = Long.parseLong(phoneStr);
	        int age = Integer.parseInt(ageStr);
		
		User user=new User(id, fn, ln, email, pswd, phone, age, gender);
		UserCrud crud=new UserCrud();
		crud.updateUser(user);
		req.setAttribute("userList", crud.fetchAll());
		RequestDispatcher dis=req.getRequestDispatcher("home.jsp");
		dis.forward(req, resp);
		
		
	}

}
