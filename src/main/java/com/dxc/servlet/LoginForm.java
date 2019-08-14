package com.dxc.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dxc.dao.UserDAO;
import com.dxc.model.User;

/**
 * Servlet implementation class LoginForm
 */
public class LoginForm extends HttpServlet {
	
	public UserDAO userDao;
	private static final long serialVersionUID = 1L;
	
       
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
		List<User> list=userDao.listUser();
		String userRe=request.getParameter("name");
		String passRe=request.getParameter("pass");
		User user=list.get(0);
		System.out.println(user);
		
		if(user.getUserName().equals(userRe) && user.getPassWord().equals(passRe)) {
			response.sendRedirect("LoginSucess.jsp");
		}
	}

}
