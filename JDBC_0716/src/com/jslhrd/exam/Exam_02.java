package com.jslhrd.exam;

import com.jslhrd.model.EmpDAO;

public class Exam_02 {

	public static void main(String[] args) {
		// 부서 수를 구하여 출력(단, 중복 제거 후 출력)
		EmpDAO dao = new EmpDAO();
		int count = dao.dno_count();
		
		System.out.println("부서수 : " + count);
	}

}
