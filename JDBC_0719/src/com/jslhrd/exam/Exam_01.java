package com.jslhrd.exam;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.model.EmpDAO;
import com.jslhrd.model.EmpDTO;

public class Exam_01 {

	public static void main(String[] args) {
//		키보드로 입력된 사원번호와 같은 부서에 근무하는 사원의 번호, 이름, 업무, 입사일자, 급여 출력
		Scanner sc = new Scanner(System.in);
		EmpDAO dao = new EmpDAO();
		
		System.out.print("사원번호 입력 : ");
		int eno = sc.nextInt();
		List<EmpDTO> list = dao.findEnoDList(eno);
		
		System.out.println("사원번호\t이름\t업무\t\t입사일자\t\t급여");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getEno() + "\t");
			System.out.print(list.get(i).getEname() + "\t");
			if (list.get(i).getJob().length() < 8) {
				System.out.print(list.get(i).getJob() + "\t\t");
			} else {
				System.out.print(list.get(i).getJob() + "\t");
			}
			System.out.print(list.get(i).getHiredate() + "\t");
			System.out.print(list.get(i).getSalary() + "\n");
		}
	}

}
