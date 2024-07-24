package com.jslhrd.exam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.jslhrd.model.MemberDAO;
import com.jslhrd.model.MemberDTO;

public class Exam_04 {

	public static void main(String[] args) {
		// 4. tbl_member 테이블에 사원등록
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String now = sdf.format(date);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("회원정보 등록(회원번호, 이름, 전화번호(010-1111-1111), 성별(남자,m,M,여자,f,F), 고객등급(직원,일반), 도시(거주지역))");
		dto.setCustno(sc.nextInt());
		dto.setCustname(sc.next());
		dto.setPhone(sc.next());
		
		String gender = sc.next();
		switch (gender.toUpperCase()) {
		case "남자" :
		case "M" :
			gender = "M";
			break;

		case "여자" :
		case "F" :
			gender = "F";
		}
		dto.setGender(gender);
		dto.setJoindate(now);
		
		String grade = sc.next();
		if (grade.equals("직원")) {
			dto.setGrade("C");
		} else {
			dto.setGrade("B");
		}
		
		String city = sc.next();
		switch (city) {
		case "서울":
			city = "01";
			break;
		case "경기":
			city = "02";
			break;
		case "인천":
			city = "03";
			break;
		case "강원":
			city = "04";
			break;
		case "충북":
			city = "05";
			break;
		case "충남":
			city = "06";
			break;
		case "전북":
			city = "07";
			break;
		case "전남":
			city = "08";
			break;
		case "경북":
			city = "09";
			break;
		case "경남":
			city = "10";
			break;
		case "제주":
			city = "11";
			break;
		}
		dto.setCity(city);
		
		int row = dao.joinMember(dto);
		
		if (row == 0) {
			System.out.println("등록 실패");
		} else {
			System.out.println("등록 성공");
		}
	}

}
