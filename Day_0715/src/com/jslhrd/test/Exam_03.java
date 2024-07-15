package com.jslhrd.test;

import com.jslhrd.model.EmpDTO;
import com.jslhrd.model.ExamDAO;

public class Exam_03 {

	public static void main(String[] args) {
		ExamDAO dao = new ExamDAO();
		
		EmpDTO dto = dao.find_name();
		
		System.out.println("번호\t이름\t직업\t상사\t입사일\t\t급여\t커미션\t부서번호");
		System.out.print(dto.getEno() + "\t");
		System.out.print(dto.getEname() + "\t");
		System.out.print(dto.getJob() + "\t");
		System.out.print(dto.getManager() + "\t");
		System.out.print(dto.getHiredate() + "\t");
		System.out.print(dto.getSalary() + "\t");
		System.out.print(dto.getCommission() + "\t");
		System.out.print(dto.getDno() + "\n");
	}

}
