package com.jslhrd.test;

import java.util.Scanner;

import com.jslhrd.model.EmpDTO;
import com.jslhrd.model.ExamDAO;

public class Exam_07 {

	public static void main(String[] args) {
		// 사원번호를 입력받아 사원의 이름과 부서번호 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사원번호 입력 : ");
		int bun = sc.nextInt();
		
		ExamDAO dao = new ExamDAO();
		EmpDTO dto = dao.find_bun(bun);
		
		System.out.println("이름\t부서번호");
		System.out.print(dto.getEname() + "\t" + dto.getDno());
	}

}
