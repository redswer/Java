package com.jslhrd.exservlet.servlet.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservlet.model.board.BoardDAO;
import com.jslhrd.exservlet.model.board.BoardDTO;

@WebServlet("/board_write")
public class BoardWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public BoardWriteServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/Board/board_write.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		BoardDAO dao = BoardDAO.getInstance();
		BoardDTO dto = new BoardDTO();
		
		dto.setName(request.getParameter("name"));
		dto.setEmail(request.getParameter("email"));
		dto.setSubject(request.getParameter("subject"));
		dto.setContents(request.getParameter("contents"));
		dto.setPass(request.getParameter("pass"));
		
		int row = dao.boardWrite(dto);
		
		/*
		if (row == 1) {
			response.sendRedirect("/board_list");
		}
		*/
		
		RequestDispatcher rd = request.getRequestDispatcher("/Board/board_write_pro.jsp");
		request.setAttribute("row", row);
		rd.forward(request, response);
	}

}
