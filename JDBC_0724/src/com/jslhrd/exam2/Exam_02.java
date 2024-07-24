package com.jslhrd.exam2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.jslhrd.model.MoneyDAO;
import com.jslhrd.model.MoneyDTO;

public class Exam_02 {

	public static void main(String[] args) {
		MoneyDAO dao = new MoneyDAO();
		MoneyDTO dto = new MoneyDTO();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String now = sdf.format(date);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("회원번호 : ");
		dto.setCustno(Integer.parseInt(sc.nextLine()));
		
		System.out.print("판매번호 : ");
		dto.setSaleno(Integer.parseInt(sc.nextLine()));
		
		System.out.print("단가 : ");
		dto.setPcost(Integer.parseInt(sc.nextLine()));
		
		System.out.print("수량 : ");
		dto.setAmount(Integer.parseInt(sc.nextLine()));
		
		System.out.print("가격 : ");
		dto.setPrice(Integer.parseInt(sc.nextLine()));
		
		System.out.print("상품코드 : ");
		dto.setPcode(sc.nextLine());
		
		dto.setSdate(now);
		
		if(dao.insert(dto) == 1) {
			System.out.println("등록 성공");
		} else {
			System.out.println("등록 실패");
		}
	}

}
