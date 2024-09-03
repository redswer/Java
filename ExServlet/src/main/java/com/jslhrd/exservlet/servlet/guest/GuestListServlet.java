package com.jslhrd.exservlet.servlet.guest;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservlet.model.guest.GuestDAO;
import com.jslhrd.exservlet.model.guest.GuestDTO;

@WebServlet("/guest_list")
public class GuestListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GuestListServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GuestDAO dao = GuestDAO.getInstance();
		
		int cnt = 0;
		List<GuestDTO> list = null;
		String search = "";
		String key = "";
		
		if (request.getParameter("key") != null) {
			search = request.getParameter("search");
			key = request.getParameter("key");
			cnt = dao.guestCount();
			list = dao.guestList(search, key);
		} else {
			cnt = dao.guestCount();
			list = dao.guestList();
		}
		
		request.setAttribute("search", search);
		request.setAttribute("key", key);
		request.setAttribute("cnt", cnt);
		request.setAttribute("list", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("/Guest/guest_list.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
