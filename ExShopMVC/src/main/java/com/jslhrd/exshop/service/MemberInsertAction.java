package com.jslhrd.exshop.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exshop.model.CityDTO;
import com.jslhrd.exshop.model.ShopDAO;

public class MemberInsertAction implements Action {

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ShopDAO dao = ShopDAO.getInstance();
		
		List<CityDTO> list = dao.cityList();
		
		request.setAttribute("list", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("/memberInsert.jsp");
		rd.forward(request, response);
	}

}
