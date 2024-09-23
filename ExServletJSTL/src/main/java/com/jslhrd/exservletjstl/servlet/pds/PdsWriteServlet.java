package com.jslhrd.exservletjstl.servlet.pds;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservletjstl.model.pds.PdsDAO;
import com.jslhrd.exservletjstl.model.pds.PdsDTO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/pds_write")
public class PdsWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PdsWriteServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/Pds/pds_write.jsp");
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
		try {
			MultipartRequest multi = new MultipartRequest(request, path, maxSize, encType, new DefaultFileRenamePolicy());
			
			dto.setName(multi.getParameter("name"));
			dto.setEmail(multi.getParameter("email"));
			dto.setSubject(multi.getParameter("subject"));
			dto.setContents(multi.getParameter("contents"));
			dto.setPass(multi.getParameter("pass"));
			
			dto.setFilename(multi.getFilesystemName("filename")); 
			String o_file_name = multi.getOriginalFileName("filename");
			
			row = dao.pdsWrite(dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		request.setAttribute("row", row);
		
		RequestDispatcher rd = request.getRequestDispatcher("/Pds/pds_write_pro.jsp");
		rd.forward(request, response);
	}

}
