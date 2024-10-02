package com.jslhrd.exshop.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exshop.model.MemberDTO;
import com.jslhrd.exshop.model.ShopDAO;

public class MemberInsertProAction implements Action {

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		ShopDAO dao = ShopDAO.getInstance();
		MemberDTO dto = new MemberDTO();
		
		dto.setCustno(Integer.parseInt(request.getParameter("custno")));
		dto.setCustname(request.getParameter("custname"));
		dto.setPhone(request.getParameter("phone1") + "-" + request.getParameter("phone2") + "-" + request.getParameter("phone3"));
		dto.setGender(request.getParameter("gender"));
		dto.setJoindate(request.getParameter("joindate"));
		dto.setGrade(request.getParameter("grade"));
		dto.setCity(request.getParameter("city"));
		
		int row = dao.memberInsert(dto);
		
		request.setAttribute("row", row);
		
		RequestDispatcher rd = request.getRequestDispatcher("/memberInsertPro.jsp");
		rd.forward(request, response);
	}

}
