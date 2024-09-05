package com.jslhrd.exservlet.servlet.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservlet.model.user.UserDAO;
import com.jslhrd.exservlet.model.user.UserDTO;
import com.jslhrd.exservlet.util.UserSHA256;

@WebServlet("/user_insert")
public class UserInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserInsertServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/User/user_insert.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		UserDAO dao = UserDAO.getInstance();
		UserDTO dto = new UserDTO();
		
		dto.setName(request.getParameter("name"));
		dto.setUserid(request.getParameter("userid"));
		dto.setPasswd(UserSHA256.getSHA256(request.getParameter("passwd")));
		dto.setTel(request.getParameter("tel"));
		dto.setEmail(request.getParameter("email1") + "@" + request.getParameter("email2"));
		
		int row = dao.userInsert(dto);
		
		request.setAttribute("row", row);
		
		RequestDispatcher rd = request.getRequestDispatcher("/User/user_insert_pro.jsp");
		rd.forward(request, response);
	}

}
