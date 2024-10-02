package com.jslhrd.exmvc.service.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exmvc.model.board.BoardDAO;
import com.jslhrd.exmvc.model.board.BoardDTO;
import com.jslhrd.exmvc.service.Action;
import com.jslhrd.exmvc.util.PageIndex;

public class BoardListAction implements Action {

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO dao = BoardDAO.getInstance();
		
		String url = "/board?cmd=board_list";
		String search = "", key = "", addtag="";
		int totcount = 0;  
		//검색 조건이 포함될경우
		if(request.getParameter("key") != null && !request.getParameter("key").equals("")) {
			search = request.getParameter("search");
			key = request.getParameter("key");
			totcount = dao.boardCount(search, key);   // 총 글수 추출
		}else {
			totcount = dao.boardCount();   // 총 글수 추출
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
		
		
		List<BoardDTO> boardList = null;
		if(key.equals("")) {
			boardList = dao.boardList(startpage, endpage);
		}else {
			boardList = dao.boardList(startpage, endpage, search, key);
		}
		
		// 페이지 인덱스
		String pageIndex = "";
		if (key.equals("")) {
			pageIndex = PageIndex.pageList(nowpage, totpage, url, addtag);
		} else {
			pageIndex = PageIndex.pageListHan(nowpage, totpage, url, search, key);
		}

		request.setAttribute("cnt", totcount);
		request.setAttribute("list", boardList);
		request.setAttribute("search", search);
		request.setAttribute("key", key);
		request.setAttribute("listcount", listcount);
		request.setAttribute("totpage", totpage);
		request.setAttribute("page", nowpage);
		request.setAttribute("pageIndex", pageIndex);
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("Board/board_list.jsp");
		dispatcher.forward(request, response);
	}

}
