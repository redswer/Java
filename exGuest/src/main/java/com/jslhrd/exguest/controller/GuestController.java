package com.jslhrd.exguest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jslhrd.exguest.domain.GuestDTO;
import com.jslhrd.exguest.service.GuestService;


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
}
