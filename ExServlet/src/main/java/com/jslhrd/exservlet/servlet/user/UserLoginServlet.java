package com.jslhrd.exservlet.servlet.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jslhrd.exservlet.model.user.UserDAO;
import com.jslhrd.exservlet.model.user.UserDTO;
import com.jslhrd.exservlet.util.UserSHA256;

@WebServlet("/user_login")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserLoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/User/user_login.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDAO dao = UserDAO.getInstance();
		
		String userid = request.getParameter("userid");
		String passwd = UserSHA256.getSHA256(request.getParameter("passwd"));
		
		int row = dao.login(userid, passwd);
		
		if (row == 1) {
			UserDTO dto = dao.userSelect(userid);
			HttpSession session = request.getSession();
			session.setAttribute("user", dto);
			session.setMaxInactiveInterval(10 * 60);
		}
		request.setAttribute("row", row);
		
		RequestDispatcher rd = request.getRequestDispatcher("/User/user_login_pro.jsp");
		rd.forward(request, response);
	}

}
