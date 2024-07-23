package registration.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import registration.dao.UserCrud;
import registration.dto.User;
@WebServlet("/login")
public class UserLogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		UserCrud crud=new UserCrud();
		
		try {
			String email=req.getParameter("email");
			String pswd=req.getParameter("pswd");
			System.out.println(email);
			System.out.println(pswd);
			
			User u=crud.fetchByEmail(email);
			if(u.getPassword().equals(pswd)) {
				req.setAttribute("user", u);
				List<User> users=crud.fetchAll();
				req.setAttribute("userList", users);
				//System.out.println("login successfull");
				RequestDispatcher dis=req.getRequestDispatcher("home.jsp");
				dis.forward(req, resp);
			}else {
				//System.out.println("entered password incorrect");
				req.setAttribute("msg", "password is wrong");
				RequestDispatcher dis=req.getRequestDispatcher("login.jsp");
				dis.include(req, resp);
			}
			
		}catch(Exception e) {
			//System.out.println("entered email is incorrect");
			
			req.setAttribute("msg", "email is wrong");
			RequestDispatcher d=req.getRequestDispatcher("login.jsp");
			d.include(req, resp);
			
			
		}
	}
	
}
