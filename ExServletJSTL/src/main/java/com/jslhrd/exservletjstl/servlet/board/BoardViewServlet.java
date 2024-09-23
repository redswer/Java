package com.jslhrd.exservletjstl.servlet.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservletjstl.model.board.BoardDAO;
import com.jslhrd.exservletjstl.model.board.BoardDTO;


@WebServlet("/board_view.do")
public class BoardViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public BoardViewServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int idx = Integer.parseInt(request.getParameter("idx"));
		int nowpage = Integer.parseInt(request.getParameter("page"));
		
		BoardDAO dao = BoardDAO.getInstance();
		boolean found = false;
		Cookie info = null;
		
		// 컴퓨터의 쿠키 목록 불러오기
		Cookie[] cookies = request.getCookies();
		
		// 쿠키 조회
		for (int i = 0; i < cookies.length; i++) {
			info = cookies[i];
			
			if (info.getName().equals("exservletJstlBoard" + idx)) {
				found = true;
				break;
			}
		}
		
		String newVal = "" + System.currentTimeMillis();
		
		if (!found) {
			dao.readcnt(idx);
			
			// 쿠키 생성 (이름, 값)
			info = new Cookie("exservletJstlBoard" + idx, newVal);
			
			// 유효기간 (기본 단위 : 초)
			info.setMaxAge(24 * 60 * 60);
			
			// 쿠키 전송
			response.addCookie(info);
		}

		BoardDTO dto = dao.boardSelect(idx);
		
		dto.setRegdate(dto.getRegdate().substring(0, 10));
		dto.setContents(dto.getContents().replace("\n", "<br>"));
		
		request.setAttribute("dto", dto);
		request.setAttribute("page", nowpage);
		
		RequestDispatcher rd = request.getRequestDispatcher("/Board/board_view.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
