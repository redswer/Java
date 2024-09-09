package com.jslhrd.exservlet.servlet.pds;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservlet.model.pds.PdsDAO;
import com.jslhrd.exservlet.model.pds.PdsDTO;

@WebServlet("/pds_list")
public class PdsListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PdsListServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PdsDAO dao = PdsDAO.getInstance();
		List<PdsDTO> list = dao.pdsList();
		int cnt = 0;
		String search = "";
		String key = "";
		
		if (request.getParameter("key") != null) {
			search = request.getParameter("search");
			key = request.getParameter("key");
			cnt = dao.pdsCount(search, key);
			list = dao.pdsList(search, key);
		} else {
			cnt = dao.pdsCount();
			list = dao.pdsList();
		}
		
		request.setAttribute("search", search);
		request.setAttribute("key", key);
		
		request.setAttribute("list", list);
		request.setAttribute("cnt", cnt);
		
		RequestDispatcher rd = request.getRequestDispatcher("Pds/pds_list.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
