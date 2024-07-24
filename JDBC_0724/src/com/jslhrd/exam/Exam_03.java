package com.jslhrd.exam;

import java.util.Scanner;

import com.jslhrd.model.MemberDAO;
import com.jslhrd.model.MemberDTO;

public class Exam_03 {

	public static void main(String[] args) {
		// 3. tbl_member 테이블에서 사원번호를 이용한 검색
		MemberDAO dao = new MemberDAO();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사원번호 입력 : ");
		MemberDTO dto = dao.search(sc.nextInt());
		
		System.out.println("고객번호\t고객이름\t전화번호\t\t성별\t가입일자\t\t고객등급\t도시코드");
		if(dto.getCustno() != 0) {
			System.out.print(dto.getCustno() + "\t");
			System.out.print(dto.getCustname() + "\t");
			System.out.print(dto.getPhone() + "\t");
			System.out.print(dto.getGender() + "\t");
			System.out.print(dto.getJoindate() + "\t");
			System.out.print(dto.getGrade() + "\t");
			System.out.print(dto.getCity() + "\n");
		} else {
			System.out.println("없는 고객입니다.");
		}
	}

}
