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


@WebServlet("/guest_write.do")
public class GuestWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GuestWriteServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/Guest/guest_write.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		GuestDAO dao = GuestDAO.getInstance();
		GuestDTO dto = new GuestDTO();
		
		dto.setName(request.getParameter("name"));
		dto.setSubject(request.getParameter("subject"));
		dto.setContents(request.getParameter("contents"));
		dto.setPass(request.getParameter("pass"));
		
		int row = dao.guestWrite(dto);
		
		RequestDispatcher rd = request.getRequestDispatcher("/Guest/guest_write_pro.jsp");
		request.setAttribute("row", row);
		rd.forward(request, response);
	}

}
