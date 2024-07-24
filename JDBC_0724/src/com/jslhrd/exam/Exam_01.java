package com.jslhrd.exam;

import com.jslhrd.model.MemberDAO;

public class Exam_01 {

	public static void main(String[] args) {
		// 1. tbl_member 테이블의 자료건수 구하기
		
		MemberDAO dao = new MemberDAO();
		
		System.out.println("tbl_member 테이블의 자료건수 : " + dao.memberCount());
	}

}
