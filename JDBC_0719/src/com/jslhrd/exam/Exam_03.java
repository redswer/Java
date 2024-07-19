package com.jslhrd.exam;

import java.util.List;

import com.jslhrd.model.EmpDAO;
import com.jslhrd.model.EmpDTO;

public class Exam_03 {

	public static void main(String[] args) {
//		부서 위치가 DALLAS 인 사원의 이름, 부서번호, 담당 업무를 출력
		EmpDAO dao = new EmpDAO();
		List<EmpDTO> list = dao.findDallas();
		
		System.out.println("이름\t부서번호\t담당업무");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getEname() + "\t");
			System.out.print(list.get(i).getDno() + "\t");
			System.out.print(list.get(i).getJob() + "\n");
		}
	}

}
