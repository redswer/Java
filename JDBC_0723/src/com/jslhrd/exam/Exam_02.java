package com.jslhrd.exam;

import com.jslhrd.model.CityDTO;
import com.jslhrd.model.ExamDAO;

public class Exam_02 {

	public static void main(String[] args) {
		ExamDAO dao = new ExamDAO();
		CityDTO dto = new CityDTO();
		
		dto.setCity("12");
		dto.setCityname("미국");
		
		if (dao.insertCity(dto) == 1) {
			System.out.println("insert 성공");
		} else {
			System.out.println("insert 실패");
		}
	}

}
