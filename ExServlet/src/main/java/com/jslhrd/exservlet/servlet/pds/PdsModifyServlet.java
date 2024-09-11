package com.jslhrd.exservlet.servlet.pds;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservlet.model.pds.PdsDAO;
import com.jslhrd.exservlet.model.pds.PdsDTO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/pds_modify")
public class PdsModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PdsModifyServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		int idx = Integer.parseInt(request.getParameter("idx"));
		int nowpage = Integer.parseInt(request.getParameter("page"));
		
		PdsDAO dao = PdsDAO.getInstance();
		PdsDTO dto = dao.pdsView(idx);
		
		request.setAttribute("dto", dto);
		request.setAttribute("page", nowpage);
		
		RequestDispatcher rd = request.getRequestDispatcher("Pds/pds_modify.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		PdsDAO dao = PdsDAO.getInstance();
		PdsDTO dto = new PdsDTO();
		
		ServletContext context = getServletContext();
		String path = context.getRealPath("Pds/upload");
		String encType = "UTF-8";
		int maxSize = 5 * 1024 * 1024;
		
		int row = 0;
		int nowpage = 0;
		
		try {
			MultipartRequest multi = new MultipartRequest(request, path, maxSize, encType, new DefaultFileRenamePolicy());
			nowpage = Integer.parseInt(multi.getParameter("page"));
			
			dto.setIdx(Integer.parseInt(multi.getParameter("idx")));
			dto.setName(multi.getParameter("name"));
			dto.setEmail(multi.getParameter("email"));
			dto.setSubject(multi.getParameter("subject"));
			dto.setContents(multi.getParameter("contents"));
			dto.setPass(multi.getParameter("pass"));
			
			if (multi.getFilesystemName("filename") != null) {
				dto.setFilename(multi.getFilesystemName("filename"));
			} else {
				dto.setFilename(multi.getParameter("o_filename"));
			}
			
			row = dao.pdsModify(dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		request.setAttribute("row", row);
		request.setAttribute("page", nowpage);
		
		RequestDispatcher rd = request.getRequestDispatcher("/Pds/pds_modify_pro.jsp");
		rd.forward(request, response);
	}

}
