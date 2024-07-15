package com.jslhrd.test;

import java.util.List;

import com.jslhrd.model.EmpDTO;
import com.jslhrd.model.ExamDAO;

public class Exam_04 {

	public static void main(String[] args) {
		ExamDAO dao = new ExamDAO();
		List<EmpDTO> list = dao.find_dno(10);
		
		System.out.println("번호\t이름\t직업\t\t상사\t입사일\t\t급여\t커미션\t부서번호");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getEno() + "\t");
			System.out.print(list.get(i).getEname() + "\t");
			if (list.get(i).getJob().length() < 8) {
				System.out.print(list.get(i).getJob() + "\t\t");
			} else {
				System.out.print(list.get(i).getJob() + "\t");
			}
			System.out.print(list.get(i).getManager() + "\t");
			System.out.print(list.get(i).getHiredate() + "\t");
			System.out.print(list.get(i).getSalary() + "\t");
			System.out.print(list.get(i).getCommission() + "\t");
			System.out.print(list.get(i).getDno() + "\n");
		}
	}

}
