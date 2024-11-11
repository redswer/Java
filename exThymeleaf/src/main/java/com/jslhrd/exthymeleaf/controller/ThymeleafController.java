package com.jslhrd.exthymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jslhrd.exthymeleaf.dto.ExamDTO;

@Controller
public class ThymeleafController {
	private static final Logger log = LoggerFactory.getLogger("ThymeleafController");
	
	@RequestMapping("/")
	public String index() {
		log.info("index 호출됨");
		
		return "index";
	}
	
	@RequestMapping("exam_01")
	public String exam_01(Model model) {
		log.info("exam_01 호출됨");
		
		model.addAttribute("data", "Hello World");
		
		return "Sample/exam_01";
	}
	
	@RequestMapping("exam_02")
	public String exam_02(Model model) {
		log.info("exam_02 호출됨");
		
		ExamDTO dto = new ExamDTO();
		dto.setName("김학생");
		dto.setGender(false);
		dto.setAge(28);
		
		model.addAttribute("dto", dto);
		
		return "Sample/exam_02";
	}
	
	@RequestMapping("exam_03")
	public String exam_03(Model model) {
		log.info("exam_03 호출됨");
		
		model.addAttribute("id", "user01");
		model.addAttribute("name", "김학생");
		model.addAttribute("score", 98);
		
		return "Sample/exam_03";
	}
	
	@RequestMapping("exam_04")
	public String exam_04(Model model) {
		log.info("exam_04 호출됨");
		
		ExamDTO dto = new ExamDTO();
		dto.setName("김학생");
		dto.setGender(false);
		dto.setAge(28);
		
		model.addAttribute("dto", dto);
		
		return "Sample/exam_04";
	}
	
	@RequestMapping("exam_05")
	public String exam_05(Model model) {
		log.info("exam_05 호출됨");
		
		List<ExamDTO> list = new ArrayList<>();
		
		list.add(new ExamDTO("김학생", true, 28));
		list.add(new ExamDTO("나학생", false, 25));
		list.add(new ExamDTO("박학생", false, 24));
		list.add(new ExamDTO("이학생", true, 30));
		list.add(new ExamDTO("오학생", true, 25));
		
		model.addAttribute("list", list);
		
		return "Sample/exam_05";
	}
}
