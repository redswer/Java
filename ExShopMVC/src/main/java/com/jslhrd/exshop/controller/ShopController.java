package com.jslhrd.exshop.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exshop.service.Action;
import com.jslhrd.exshop.service.MemberInsertAction;
import com.jslhrd.exshop.service.MemberInsertProAction;
import com.jslhrd.exshop.service.MemberListAction;

@WebServlet("/shop")
public class ShopController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ShopController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		
		System.out.println("요청 : " + cmd);
		
		Action action = null;
		
		if (cmd.equals("insert")) {
			action = new MemberInsertAction();
		} else if (cmd.equals("insertPro")) {
			action = new MemberInsertProAction();
		} else if (cmd.equals("list")) {
			action = new MemberListAction();
		}
		
		action.process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
