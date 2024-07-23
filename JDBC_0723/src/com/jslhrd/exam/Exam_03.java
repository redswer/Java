package com.jslhrd.exam;

import java.util.Scanner;

import com.jslhrd.model.CityDTO;
import com.jslhrd.model.ExamDAO;

public class Exam_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ExamDAO dao = new ExamDAO();
		CityDTO dto = new CityDTO();
		
		System.out.print("도시코드 도시명 입력 : ");
		dto.setCity(sc.next());
		dto.setCityname(sc.next());
		
		if (dao.insertCity(dto) == 1) {
			System.out.println("insert 성공");
		} else {
			System.out.println("insert 실패");
		}
	}

}
