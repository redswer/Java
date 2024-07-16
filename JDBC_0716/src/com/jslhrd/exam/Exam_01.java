package com.jslhrd.exam;

import com.jslhrd.model.EmpDAO;

public class Exam_01 {

	public static void main(String[] args) {
		// 사원수 출력
		
		EmpDAO dao = new EmpDAO();
		int count = dao.count();
		
		System.out.println("사원수 : " + count);
	}

}
