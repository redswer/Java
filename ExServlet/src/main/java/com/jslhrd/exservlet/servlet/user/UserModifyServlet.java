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

@WebServlet("/user_modify")
public class UserModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserModifyServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/User/user_modify.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		UserDAO dao = UserDAO.getInstance();
		UserDTO dto = new UserDTO();
		
		dto.setUserid(request.getParameter("userid"));
		dto.setPasswd(UserSHA256.getSHA256(request.getParameter("passwd")));
		dto.setTel(request.getParameter("tel"));
		dto.setEmail(request.getParameter("email1") + "@" + request.getParameter("email2"));
		
		int row = dao.userModify(dto);
		
//		dto = dao.userSelect(request.getParameter("userid"));
//		HttpSession session = request.getSession();
//		session.setAttribute("user", dto);
//		session.setMaxInactiveInterval(30 * 60);
		
		HttpSession session = request.getSession();
		session.invalidate();
		
		request.setAttribute("row", row);
		
		RequestDispatcher rd = request.getRequestDispatcher("/User/user_modify_pro.jsp");
		rd.forward(request, response);
	}

}
