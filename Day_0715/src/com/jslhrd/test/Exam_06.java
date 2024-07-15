package com.jslhrd.test;

import java.util.List;

import com.jslhrd.model.EmpDTO;
import com.jslhrd.model.ExamDAO;

public class Exam_06 {

	public static void main(String[] args) {
		ExamDAO dao = new ExamDAO();
		List<EmpDTO> list = dao.bonus(20);
		
		System.out.println("번호\t이름\t급여\t보너스");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getEno() + "\t");
			System.out.print(list.get(i).getEname() + "\t");
			System.out.print(list.get(i).getSalary() + "\t");
			System.out.print(list.get(i).getBonus() + "\n");
		}
	}

}
