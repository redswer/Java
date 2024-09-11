package com.jslhrd.exservlet.servlet.pds;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservlet.model.pds.PdsDAO;
import com.jslhrd.exservlet.model.pds.PdsDTO;

@WebServlet("/pds_view")
public class PdsViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PdsViewServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int idx = Integer.parseInt(request.getParameter("idx"));
		int nowpage = Integer.parseInt(request.getParameter("page"));
		
		PdsDAO dao = PdsDAO.getInstance();
		boolean found = false;
		Cookie info = null;
		
		// 컴퓨터의 쿠키 목록 불러오기
		Cookie[] cookies = request.getCookies();
		
		// 쿠키 조회
		for (int i = 0; i < cookies.length; i++) {
			info = cookies[i];
			
			if (info.getName().equals("pds" + idx)) {
				found = true;
				break;
			}
		}
		
		String newVal = "" + System.currentTimeMillis();
		
		if (!found) {
			dao.pdsReadcnt(idx);
			
			// 쿠키 생성 (이름, 값)
			info = new Cookie("pds" + idx, newVal);
			
			// 유효기간 (기본 단위 : 초)
			info.setMaxAge(24 * 60 * 60);
			
			// 쿠키 전송
			response.addCookie(info);
		}
		
		PdsDTO dto = dao.pdsView(idx);
		dto.setContents(dto.getContents().replace("\n", "<br>"));
		dto.setRegdate(dto.getRegdate().substring(0, 10));
		
		request.setAttribute("dto", dto);
		request.setAttribute("page", nowpage);
		
		RequestDispatcher rd = request.getRequestDispatcher("/Pds/pds_view.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
