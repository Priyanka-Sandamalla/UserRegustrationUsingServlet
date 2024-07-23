package registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import registration.dao.UserCrud;
@WebServlet("/edit")
public class UpdateUser extends HttpServlet {
	

	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id= req.getParameter("id");
		UserCrud crud=new UserCrud();
		req.setAttribute("user", crud.fetchUserById(Integer.parseInt(id)) );
		RequestDispatcher dis=req.getRequestDispatcher("update.jsp");
		dis.forward(req, resp);
	}
}
