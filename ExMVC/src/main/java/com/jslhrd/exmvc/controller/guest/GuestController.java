package com.jslhrd.exmvc.controller.guest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exmvc.service.Action;
import com.jslhrd.exmvc.service.guest.GuestListAction;
import com.jslhrd.exmvc.service.guest.GuestWriteAction;
import com.jslhrd.exmvc.service.guest.GuestWriteProAction;

@WebServlet("/guest")
public class GuestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GuestController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		System.out.println("GuestController 에서 요청을 받음 : " + cmd);
		
		Action action = null;
		
		if (cmd.equals("guest_list")) {
			action = new GuestListAction();
		} else if (cmd.equals("guest_write")) {
			action = new GuestWriteAction();
		} else if (cmd.equals("guest_write_pro")) {
			action = new GuestWriteProAction();
		}
		
		action.process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
