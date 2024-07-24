package com.jslhrd.exam;

import java.util.List;

import com.jslhrd.model.MemberDAO;
import com.jslhrd.model.MemberDTO;

public class Exam_02 {

	public static void main(String[] args) {
		// 2. tbl_member 테이블 전체 목록 구하기
		/* 	- 성별은 M : 남자 , F : 여자
		 * 	- 가입일자는 yyyy년 mm월 dd일 형식으로 출력
		 * 	- 고객등급은 A : VIP, B : 일반, C : 직원 으로 출력
		 * */
		MemberDAO dao = new MemberDAO();
		List<MemberDTO> list = dao.memberList();
		
		System.out.println("고객번호\t고객이름\t전화번호\t\t성별\t가입일자\t\t고객등급\t도시코드");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getCustno() + "\t");
			System.out.print(list.get(i).getCustname() + "\t");
			System.out.print(list.get(i).getPhone() + "\t");
			System.out.print(list.get(i).getGender() + "\t");
			System.out.print(list.get(i).getJoindate() + "\t");
			System.out.print(list.get(i).getGrade() + "\t");
			System.out.print(list.get(i).getCity() + "\n");
			
		}
	}

}
