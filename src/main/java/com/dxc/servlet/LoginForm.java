package com.dxc.servlet;

import java.io.IOException;

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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userRe=request.getParameter("name");
		String passRe=request.getParameter("pass");

		User user = new User();
		user.setUserName(userRe);
		user.setPassWord(passRe);
		if (userDao.validate(user)) {
		    //HttpSession session = request.getSession();
		    // session.setAttribute("username",username);
		    response.sendRedirect("LoginSuccess.jsp");
		} else {
		    HttpSession session = request.getSession();
		    //session.setAttribute("user", username);
		    //response.sendRedirect("login.jsp");
		}
	}

}
