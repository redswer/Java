package com.jslhrd.exmvc.service.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exmvc.model.board.BoardDAO;
import com.jslhrd.exmvc.model.board.BoardDTO;
import com.jslhrd.exmvc.service.Action;

public class BoardDeleteProAction implements Action {

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		int idx = Integer.parseInt(request.getParameter("idx"));
		String pass = request.getParameter("pass");
		int nowpage = Integer.parseInt(request.getParameter("page"));
		
		
		BoardDAO dao = BoardDAO.getInstance();
		BoardDTO dto = new BoardDTO();
		
		dto.setIdx(idx);
		dto.setPass(pass);
		
		int row = dao.boardDelete(dto);
		
		request.setAttribute("row", row);
		request.setAttribute("page", nowpage);
		
		RequestDispatcher rd = request.getRequestDispatcher("/Board/board_delete_pro.jsp");
		rd.forward(request, response);
	}

}
