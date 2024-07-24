package com.jslhrd.exam2;

import java.text.DecimalFormat;
import java.util.List;

import com.jslhrd.model.MemberDTO;
import com.jslhrd.model.MoneyDAO;

public class Exam_07 {

	public static void main(String[] args) {
		MoneyDAO dao = new MoneyDAO();
		DecimalFormat df = new DecimalFormat("#,###");
		List<MemberDTO> list = dao.memberMoney();
		
		System.out.println("회원번호\t회원성명\t전화번호\t\t고객등급\t매출");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getCustno() + "\t");
			System.out.print(list.get(i).getCustname() + "\t");
			System.out.print(list.get(i).getPhone() + "\t");
			System.out.print(list.get(i).getGrade() + "\t");
			System.out.print(df.format(list.get(i).getSum()) + "\n");
		}
	}

}
