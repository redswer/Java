package com.jslhrd.exam2;

import java.util.List;

import com.jslhrd.model.MemberDTO;
import com.jslhrd.model.MoneyDAO;

public class Exam_06 {

	public static void main(String[] args) {
		MoneyDAO dao = new MoneyDAO();
		List<MemberDTO> list = dao.memberList();
		
		System.out.println("회원번호\t회원성명\t전화번호\t\t성별\t가입일자\t\t고객등급\t거주지역");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getCustno() + "\t");
			System.out.print(list.get(i).getCustname() + "\t");
			System.out.print(list.get(i).getPhone() + "\t");
			System.out.print(list.get(i).getGender() + "\t");
			System.out.print(list.get(i).getJoindate() + "\t");
			System.out.print(list.get(i).getGrade() + "\t");
			System.out.print(list.get(i).getCityname() + "\n");
		}
	}

}
