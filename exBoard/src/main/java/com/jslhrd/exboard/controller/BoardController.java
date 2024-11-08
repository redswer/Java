package com.jslhrd.exboard.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jslhrd.exboard.domain.BoardDTO;
import com.jslhrd.exboard.service.BoardService;

@Controller
@RequestMapping("Board")
public class BoardController {
	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService service;
	
	@GetMapping("board_list")
	public void boardList(Model model) {
		log.info("boardList() 호출됨");
		
		model.addAttribute("count", service.boardCount());
		model.addAttribute("list", service.boardList());
	}
	
	@GetMapping("board_write")
	public void boardWrite() {
		log.info("boardWrite() 호출됨");
	}
	
	@PostMapping("board_write")
	public String boardWrite(BoardDTO dto, Model model) {
		log.info("board_write() 호출됨");
		
		int row = service.boardWrite(dto);
		model.addAttribute("row", row);
		
		return "/Board/board_write_pro";
	}
	
	@GetMapping("board_view")
	public void boardView(int idx, Model model) {
		log.info("boardView() 호출됨");
		
		BoardDTO dto = service.boardView(idx);
		dto.setContents(dto.getContents().replace("\n", "<br>"));
		
		model.addAttribute("dto", dto);
	}
	
	@GetMapping("board_modify")
	public void boardModify(int idx, Model model) {
		log.info("boardModify() 호출됨");
		
		BoardDTO dto = service.boardView(idx);
		
		model.addAttribute("dto", dto);
	}
	
	@PostMapping("board_modify")
	public String boardModify(BoardDTO dto, Model model) {
		log.info("board_modify() 호출됨");
		
		int row = service.boardModify(dto);
		
		model.addAttribute("row", row);
		
		return "/Board/board_modify_pro";
	}
	
	@GetMapping("board_delete")
	public void boardDelete(int idx, Model model) {
		log.info("boardDelete() 호출됨");
		
		model.addAttribute("idx", idx);
	}
	
	@PostMapping("board_delete")
	public String boardDelete(int idx, String pass, Model model) {
		log.info("board_delete() 호출됨");
		
		int row = service.boardDelete(idx, pass);
		model.addAttribute("row", row);
		
		return "/Board/board_delete_pro";
	}
}
