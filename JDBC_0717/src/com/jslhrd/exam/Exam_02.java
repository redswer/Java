package com.jslhrd.exam;

import java.text.DecimalFormat;
import java.util.Scanner;

import com.jslhrd.model.EmpDAO;
import com.jslhrd.model.EmpDTO;

public class Exam_02 {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###");
		
		System.out.print("사원번호 : ");
		int eno = sc.nextInt();
		
		EmpDTO dto = dao.searchEno(eno);
		
		if (dto.getEno() == 0) {
			System.out.println("등록된 사원이 존재하지 않습니다.");
		} else {
			System.out.println("사원번호\t이름\t직급\t\t입사일자\t\t급여\t부서번호");
			System.out.print(dto.getEno() + "\t");
			System.out.print(dto.getEname() + "\t");
			if (dto.getJob().length() < 8) {
				System.out.print(dto.getJob() + "\t\t");
			} else {
				System.out.print(dto.getJob() + "\t");
			}
			System.out.print(dto.getHiredate() + "\t");
			System.out.print(df.format(dto.getSalary()) + "\t");
			System.out.print(dto.getDno() + "\n");
		}
	}

}
