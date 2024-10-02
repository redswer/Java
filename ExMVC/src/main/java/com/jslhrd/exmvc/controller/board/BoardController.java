package com.jslhrd.exmvc.controller.board;

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

@WebServlet("/board")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BoardController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		System.out.println("BoardController 에서 사용자 요청 받음 : " + cmd);
		
		BoardActionFactory bf = BoardActionFactory.getInstance();
		
		Action action = bf.getAction(cmd);
		
		if (action != null) {
			action.process(request, response);
		} else {
			System.out.println("aciton : null");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");;
		doGet(request, response);
	}

}
