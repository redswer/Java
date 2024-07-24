package com.jslhrd.exam2;

import java.text.DecimalFormat;
import java.util.List;

import com.jslhrd.model.MoneyDAO;
import com.jslhrd.model.MoneyDTO;

public class Exam_04 {

	public static void main(String[] args) {
		MoneyDAO dao = new MoneyDAO();
		List<MoneyDTO> list = dao.selectAll();
		DecimalFormat df = new DecimalFormat("#,###");
		
		System.out.println("회원번호\t판매번호\t\t단가\t수량\t가격\t상품코드\t판매일자");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getCustno() + "\t");
			System.out.print(list.get(i).getSaleno() + "\t");
			System.out.print(list.get(i).getPcost() + "\t");
			System.out.print(list.get(i).getAmount() + "\t");
			System.out.print(df.format(list.get(i).getPrice()) + "\t");
			System.out.print(list.get(i).getPcode() + "\t");
			System.out.print(list.get(i).getSdate() + "\n");
		}
	}

}
