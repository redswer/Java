package com.jslhrd.exservletjstl.servlet.guest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservletjstl.model.guest.GuestDAO;
import com.jslhrd.exservletjstl.model.guest.GuestDTO;


/**
 * Servlet implementation class GuestModifyServlet
 */
@WebServlet("/guest_modify.do")
public class GuestModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GuestModifyServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		int nowpage = Integer.parseInt(request.getParameter("page"));
		int idx = Integer.parseInt(request.getParameter("idx"));
		
		GuestDAO dao = GuestDAO.getInstance();
		GuestDTO dto = dao.guestView(idx);
		
		request.setAttribute("dto", dto);
		request.setAttribute("page", nowpage);
		
		RequestDispatcher rd = request.getRequestDispatcher("/Guest/guest_modify.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		int idx = Integer.parseInt(request.getParameter("idx"));
		int nowpage = Integer.parseInt(request.getParameter("page"));
		
		
		GuestDAO dao = GuestDAO.getInstance();
		GuestDTO dto = new GuestDTO();
		
		dto.setIdx(idx);
		dto.setSubject(request.getParameter("subject"));
		dto.setContents(request.getParameter("contents"));
		dto.setPass(request.getParameter("pass"));
		
		int row = dao.guestModify(dto);
		
		request.setAttribute("idx", idx);
		request.setAttribute("row", row);
		request.setAttribute("page", nowpage);
		
		RequestDispatcher rd = request.getRequestDispatcher("Guest/guest_modify_pro.jsp");
		rd.forward(request, response);
	}

}
