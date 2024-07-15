package com.jslhrd.test;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.model.EmpDTO;
import com.jslhrd.model.ExamDAO;

public class Exam_05 {
	// 키보드로 급여를 입력받아 입력된 급여 이상을 받는 사원의 번호, 이름, 급여를 출력(급여순 내림차순 출력)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("급여 입력 : ");
		int salary = sc.nextInt();
		
		ExamDAO dao = new ExamDAO();
		List<EmpDTO> list = dao.find_salary(salary);
		
		System.out.println("번호\t이름\t급여");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getEno() + "\t");
			System.out.print(list.get(i).getEname() + "\t");
			System.out.print(list.get(i).getSalary() + "\n");
		}
	}

}
