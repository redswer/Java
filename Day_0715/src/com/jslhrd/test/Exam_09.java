package com.jslhrd.test;

import java.util.Scanner;

import com.jslhrd.model.ExamDAO;

public class Exam_09 {

	public static void main(String[] args) {
		// 입력 부서번호가 10번인 사원의 급여 합계 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("부서 입력 : ");
		int dno = sc.nextInt();
		
		ExamDAO dao = new ExamDAO();
		
		System.out.println("부서번호 " + dno + " 급여 합계 : " + dao.dno_salary_sum(dno));
	}

}
