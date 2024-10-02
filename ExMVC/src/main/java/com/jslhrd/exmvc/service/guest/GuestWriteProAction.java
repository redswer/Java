package com.jslhrd.exmvc.service.guest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exmvc.model.guest.GuestDAO;
import com.jslhrd.exmvc.model.guest.GuestDTO;
import com.jslhrd.exmvc.service.Action;

public class GuestWriteProAction implements Action {

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
