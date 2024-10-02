package com.jslhrd.exmvc.service.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exmvc.model.board.BoardDAO;
import com.jslhrd.exmvc.model.board.BoardDTO;
import com.jslhrd.exmvc.service.Action;

public class BoardModifyProAction implements Action {

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO dao = BoardDAO.getInstance();
		BoardDTO dto = new BoardDTO();
		
		dto.setIdx(Integer.parseInt(request.getParameter("idx")));
		dto.setEmail(request.getParameter("email"));
		dto.setSubject(request.getParameter("subject"));
		dto.setContents(request.getParameter("contents"));
		dto.setPass(request.getParameter("pass"));
		
		int nowpage = Integer.parseInt(request.getParameter("page"));

		
		int row = dao.boardModify(dto);
		
		request.setAttribute("row", row);
		request.setAttribute("page", nowpage);
		
		RequestDispatcher rd = request.getRequestDispatcher("/Board/board_modify_pro.jsp");
		rd.forward(request, response);
	}

}
