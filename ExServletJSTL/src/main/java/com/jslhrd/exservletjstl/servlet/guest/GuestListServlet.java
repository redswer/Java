package com.jslhrd.exservletjstl.servlet.guest;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservletjstl.model.guest.GuestDAO;
import com.jslhrd.exservletjstl.model.guest.GuestDTO;
import com.jslhrd.exservletjstl.util.PageIndex;


@WebServlet("/guest_list.do")
public class GuestListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GuestListServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GuestDAO dao = GuestDAO.getInstance();
		
		String url = "guest_list";
		String search = "", key = "", addtag="";
		
		int totcount = 0;  
		//검색 조건이 포함될경우
		if(request.getParameter("key") != null && !request.getParameter("key").equals("")) {
			search = request.getParameter("search");
			key = request.getParameter("key");
			totcount = dao.guestCount(search, key);   // 총 글수 추출
		}else {
			totcount = dao.guestCount();   // 총 글수 추출
		}

		//페이지수 계산
		int nowpage = 1;//현재페이지
		int maxlist = 10;//페이지당 글수
		int totpage = 1;//총페이지수
		
		if(totcount % 10 == 0)
			totpage = totcount / maxlist;
		else
			totpage = totcount / maxlist + 1;
		
		if(totpage == 0)
			totpage = 1;
		
		if(request.getParameter("page") != null) {
			nowpage = Integer.parseInt(request.getParameter("page"));
		}
		//현재페이지가 총페이지보다 클때 마지막페이지로 대체
		if(nowpage > totpage)
			nowpage= totpage;
		
		int startpage = (nowpage - 1) * maxlist + 1;//페이지 시작번호
		int endpage = nowpage * maxlist;
		int listcount = totcount - ((nowpage - 1) * maxlist);//일련번호 출력용
		
		
		List<GuestDTO> guestList = null;
		if(key.equals("")) {
			guestList = dao.guestList(startpage, endpage);
		}else {
			guestList = dao.guestList(startpage, endpage, search, key);
		}
		
		// 페이지 인덱스
		String pageIndex = "";
		if (key.equals("")) {
			pageIndex = PageIndex.pageList(nowpage, totpage, url, addtag);
		} else {
			pageIndex = PageIndex.pageListHan(nowpage, totpage, url, search, key);
		}

		request.setAttribute("cnt", totcount);
		request.setAttribute("list", guestList);
		request.setAttribute("search", search);
		request.setAttribute("key", key);
		request.setAttribute("listcount", listcount);
		request.setAttribute("totpage", totpage);
		request.setAttribute("page", nowpage);
		request.setAttribute("pageIndex", pageIndex);
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("Guest/guest_list.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
