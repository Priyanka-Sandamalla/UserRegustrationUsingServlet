package registration.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import registration.dao.UserCrud;
import registration.dto.User;
@WebServlet("/registration")
public class UserRegistration extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String name = req.getParameter("name");
//		String phone = req.getParameter("phone");
//		String email = req.getParameter("email");
//		String age = req.getParameter("age");
//		String gender = req.getParameter("gender");
//		String pswd = req.getParameter("pswd");
//		System.out.println("Name :"+" "+name);
//		System.out.println("Phone :"+" "+phone);
//		System.out.println("Email :"+" "+email);
//		System.out.println("Age :"+" "+age);
//		System.out.println("Gender :"+" "+gender);
//		System.out.println("Password :"+" "+pswd);
//		PrintWriter writer=res.getWriter();
//		writer.println("<html>"
//				+ "<body>"
//				+ "<h3>"
//				+ "Name :"+" "+name +"<br><br>"
//				+"Phone :"+" "+phone +"<br><br>"
//				+"Email :"+" "+email +"<br><br>"
//				+"Age :"+" "+age+"<br><br>"
//				+"Gender :"+" "+gender+"<br><br>"
//				+"Password :"+" "+pswd+"<br><br>"
//				+ "</h3>"
//				+ "</body>"
//				+ "</html>");
		
		String fn = req.getParameter("fn");
		String ln = req.getParameter("ln");
		String email = req.getParameter("email");
		String pswd = req.getParameter("pswd");
		long phone =Long.parseLong(req.getParameter("phone")) ;
		int age =Integer.parseInt(req.getParameter("age")) ;
		String gender = req.getParameter("gender");
		
		
//		int age1=Integer.parseInt(age);
//		long phn=Long.parseLong(phone);
		
		try {
			UserCrud crud=new UserCrud();
			User u=new User(fn, ln, email, pswd, phone, age, gender);
		      crud.saveUser(u);
			
			RequestDispatcher dispatch=req.getRequestDispatcher("login.jsp");
			dispatch.forward(req, res);
		}catch(Exception e) {
			RequestDispatcher d=req.getRequestDispatcher("registration.jsp");
			d.forward(req, res);
		}
		
		
		
	}
}
