package com.jslhrd.exam;

import java.util.List;

import com.jslhrd.model.MemberDAO;
import com.jslhrd.model.MemberDTO;

public class Exam_02 {

	public static void main(String[] args) {
		// 회원목록 출력
		MemberDAO dao = new MemberDAO();
		List<MemberDTO> list = dao.memberList();
		
		System.out.println("회원번호\t회원이름\t연락처\t\t성별\t가입일자\t\t고객등급\t도시코드");
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
