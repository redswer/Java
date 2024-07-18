package com.jslhrd.exam;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.model.ExamDAO;
import com.jslhrd.model.ExamDTO;

public class Exam_01 {

	public static void main(String[] args) {
		// EQUI 조인을 사용하여 이름을 입력받아 그 사원의 사원번호, 이름, 부서번호, 부서이름 출력
		ExamDAO dao = new ExamDAO();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		List<ExamDTO> list = dao.findScott(sc.nextLine().toUpperCase());
		
		
		if (list.size() == 0) {
			System.out.println("없는 사원");
		} else {
			System.out.println("사원번호\t이름\t부서번호\t부서이름");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getEno() + "\t");
				System.out.print(list.get(i).getEname() + "\t");
				System.out.print(list.get(i).getDno() + "\t");
				System.out.print(list.get(i).getDname() + "\n");
			}
		}
	}

}
