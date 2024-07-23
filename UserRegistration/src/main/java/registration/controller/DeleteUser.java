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
@WebServlet("/delete")
public class DeleteUser extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("deleted");
		String value = req.getParameter("id");
		UserCrud user=new UserCrud();
		System.out.println(value);
		user.deleteUser(Integer.parseInt(value));
		req.setAttribute("userList", user.fetchAll());
		
		RequestDispatcher dis=req.getRequestDispatcher("home.jsp");
		dis.forward(req, resp);
	}
}
