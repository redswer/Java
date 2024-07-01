package com.jslhrd.ccc;

import java.io.File;
import java.util.*;

public class MemberExam {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("src/member.txt"));
		Map<String, Member> map = new HashMap<>();
		
		while(sc.hasNext()) {
			String member = sc.nextLine();
			String m[] = member.split(",");
			
			String num = m[0];
			String name = m[1];
			String phone = m[2];
			String gender = m[3];
			String joindate = m[4];
			String grade = m[5];
			String citycode = m[6];
			
			if (map.containsKey(num)) {
				System.out.println("중복");
			} else {
				map.put(num, new Member(name, phone, gender, joindate, grade, citycode));
			}
		}
		
		System.out.println("회원번호\t회원성명\t전화번호\t\t성별\t가입일자\t\t고객등급\t거주지역");
		Set<String> key = map.keySet();
		for (String s : key) {
			System.out.print(s + "\t");
			System.out.print(map.get(s).getName() + "\t");
			System.out.print(map.get(s).getPhone() + "\t");
			System.out.print(map.get(s).getGender() + "\t");
			
			String date = map.get(s).getJoindate();
			System.out.print(date.substring(0, 4) + "년" + date.substring(4,6) + "월" + date.substring(6,8) + "일\t");
			
			String grade = "일반";
			switch (map.get(s).getGrade()) {
			case "A":
				grade = "VIP";
				break;
				
			case "C":
				grade = "직원";
				break;
			}
			System.out.print(grade + "\t");
			
			String area = "제주";
			switch (map.get(s).getCitycode()) {
			case "01":
				area = "서울";
				break;

			case "02":
				area = "경기";
				break;
				
			case "03":
				area = "인천";
				break;
				
			case "04":
				area = "대전";
				break;
			}
			System.out.print(area + "\n");
		}
	}

}
