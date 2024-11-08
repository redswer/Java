package com.jslhrd.exguest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jslhrd.exguest.domain.GuestDTO;
import com.jslhrd.exguest.service.GuestService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@Controller
@RequestMapping("Guest")
public class GuestController {
	// 로그 출력용
	private static final Logger log = LoggerFactory.getLogger(GuestController.class);
	
	// 리턴 타입이 void 면 자동으로 jsp
//	@GetMapping("/guest_list")
//	public void guestList() {
//		log.info("guestList() 메소드가 호출됨");
//	}
	
	@Autowired
	private GuestService service;
	
	// 리턴타입이 String 이면 return 해줘야 함
	@GetMapping("/guest_list")
	public String guestList(Model model) {
		log.info("guestList() 메소드가 호출됨");
		
		int cnt = service.guestCount();
		int page = cnt / 10;
		List<GuestDTO> list = service.guestList();
		
		model.addAttribute("cnt", cnt);
		model.addAttribute("page", page);
		model.addAttribute("list", list);
		
		return "Guest/guest_list";
	}
	
	@GetMapping("/guest_write")
	public void guestWrite() {
		log.info("guest_write 호출됨");
	}
	
	@PostMapping("/guest_write")
	public String guestWritePro(GuestDTO dto) {
		service.guestWrite(dto);
		
		return "redirect:guest_list";
	}
//	@PostMapping("/guest_write")
//	public String guestWritePro(GuestDTO dto, Model model) {
//		int row = service.guestWrite(dto);
//		
//		model.addAttribute("row", row);
//		
//		return "/Guest/guest_write_pro";
//	}
	
	// 조회수 증가
	@GetMapping("/guest_hits")
	public String guestReadcnt(int idx, HttpServletRequest request, HttpServletResponse response) {
		log.info("guest_hits 의 idx : " + idx);
		
		service.guestReadcnt(idx, request, response);
		
		return "redirect:guest_view?idx=" + idx;
	}
	
	@GetMapping("/guest_view")
	public void guestView(int idx, Model model) {
		log.info("guest_view 의 idx : " + idx);
		
		GuestDTO dto = service.guestView(idx);
		
		dto.setContents(dto.getContents().replace("\n", "<br>"));
		
		model.addAttribute("dto", dto);
	}
	
	@GetMapping("guest_modify")
	public void guestUpdate(int idx, Model model) {
		log.info("guestUpdate 의 idx = " + idx);
		
		GuestDTO dto = service.guestView(idx);
		
		model.addAttribute("dto", dto);
	}
	
	@PostMapping("/guest_modify")
	public String guestUpdate(GuestDTO dto) {
		service.guestUpdate(dto);
		
		return "redirect:guest_list";
	}
//	@PostMapping("/guest_modify")
//	public String guestUpdate(GuestDTO dto, Model model) {
//		int row = service.guestUpdate(dto);
//		
//		model.addAttribute("row", row);
//		
//		return "/Guest/guest_update_pro";
//	}
	
	@GetMapping("/guest_delete")
	public void guestDelete(int idx) {
		log.info("guestDelete 의 idx = " + idx);
	}
	
	@PostMapping("/guest_delete")
	public String guestDelete(GuestDTO dto) {
		service.guestDelete(dto);
		
		return "redirect:guest_list";
	}
}
