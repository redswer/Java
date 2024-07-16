package com.jslhrd.exam;

import java.util.List;

import com.jslhrd.model.DnoCountDTO;
import com.jslhrd.model.EmpDAO;

public class Exam_03 {

	public static void main(String[] args) {
		// 테이블에 존재하는 부서별 사원수를 구하여 출력(부서별 오름차순)
		EmpDAO dao = new EmpDAO();
		List<DnoCountDTO> list = dao.dnoCount();
		
		System.out.println("부서명\t사원수");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getDno() + "\t");
			System.out.print(list.get(i).getCount() + "\n");
		}
	}

}
