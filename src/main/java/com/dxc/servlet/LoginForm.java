package com.dxc.servlet;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dxc.dao.UserDAO;
import com.dxc.dao.UserDAOImpl;
import com.dxc.model.User;

/**
 * Servlet implementation class LoginForm
 */
public class LoginForm extends HttpServlet {

	public UserDAO userDao;
	private static final long serialVersionUID = 1L;

	public void init() {
		userDao = new UserDAOImpl();
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpServletResponse httpResponse = (HttpServletResponse)response;
		String userRe = request.getParameter("name");
		String passRe = request.getParameter("pass");
/*		httpResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
		httpResponse.setHeader("Pragma", "no-cache"); // HTTP 1.0.
		httpResponse.setDateHeader("Expires", 0);
		chain.doFilter(request, response);*/
		User user = new User();
		user.setUserName(userRe);
		user.setPassWord(passRe);
		int timeOut = 5;
		if (userDao.validate(user)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", userRe);
			session.setAttribute("password", passRe);
			session.setMaxInactiveInterval(timeOut);
			response.sendRedirect("LoginSuccess.jsp");

		} else {
			response.sendRedirect("LoginForm.jsp");
		}
	}

}
