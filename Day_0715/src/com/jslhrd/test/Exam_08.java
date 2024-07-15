package com.jslhrd.test;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.model.EmpDTO;
import com.jslhrd.model.ExamDAO;

public class Exam_08 {

	public static void main(String[] args) {
		// 커미션을 입력받아 입력받은 커미션 이상인 사원의 이름과 급여, 커미션을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("커미션 입력 : ");
		int co = sc.nextInt();
		
		ExamDAO dao = new ExamDAO();
		List<EmpDTO> list = dao.find_commission(co);
		
		System.out.println("이름\t급여\t커미션");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getEname() + "\t");
			System.out.print(list.get(i).getSalary() + "\t");
			System.out.print(list.get(i).getCommission() + "\n");
		}
	}

}
