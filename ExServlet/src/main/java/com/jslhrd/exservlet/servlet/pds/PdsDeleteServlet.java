package com.jslhrd.exservlet.servlet.pds;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservlet.model.pds.PdsDAO;


@WebServlet("/pds_delete")
public class PdsDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PdsDeleteServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int nowpage = Integer.parseInt(request.getParameter("page"));
		request.setAttribute("page", nowpage);
		
		RequestDispatcher rd = request.getRequestDispatcher("Pds/pds_delete.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		int idx = Integer.parseInt(request.getParameter("idx"));
		String pass = request.getParameter("pass");
		int nowpage = Integer.parseInt(request.getParameter("page"));
		
		PdsDAO dao = PdsDAO.getInstance();
		
		int row = dao.pdsDelete(idx, pass);
		
		request.setAttribute("row", row);
		request.setAttribute("page", nowpage);
		
		RequestDispatcher rd = request.getRequestDispatcher("Pds/pds_delete_pro.jsp");
		rd.forward(request, response);
	}

}
