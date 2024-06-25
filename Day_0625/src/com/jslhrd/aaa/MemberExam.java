package com.jslhrd.aaa;

import java.util.*;

public class MemberExam {
	/* [입력형식]
	 * 자료입력 : 홍길동,900209-1,010-2242-3810
	 * 자료입력 : 김자바,951015-2,010-1111-2222
	 * 자료입력 : 홍자동,890723-1,010-2222-3333
	 * ...
	 * 자료입력 : end
	 * 
	 * [출력형식]
	 * 이름    생년월일            전화             성별    나이
	 * 홍길동   90년 02월 06일     010-2242-3810   남     30
	 * ...
	 * 
	 * 총 인원수 : xx명
	 * 
	 * [처리조건]
	 * - 입력은 1라인씩 키보드로 입력
	 * - 성별 체크 : 남성 = 1, 여성 = 2
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Member> list = new ArrayList<Member>();
		StringTokenizer st = null;
		
		while (true) {
			System.out.print("자료입력 : ");
			String s = sc.nextLine();
			
			st = new StringTokenizer(s, ",");

			String name = st.nextToken();
			
			if (name.equals("end")) {
				break;
			}
			
			String num = st.nextToken();
			String[] reg = num.split("-");
			String phone = st.nextToken();
			
			int year_s = Integer.parseInt(reg[0].substring(0, 2));
			Calendar cal = Calendar.getInstance();
			
			if (year_s > 24) {
				year_s += 1900;
			} else {
				year_s += 2000;
			}
			
			int age = cal.get(Calendar.YEAR) + 1 - year_s;
			
			String year = reg[0].substring(0, 2) + "년";
			String month = reg[0].substring(2, 4) + "월";
			String day = reg[0].substring(4, 6) + "일";
			String birth = year + " " + month + " " + day;
			
			
			String gender = "남";
			if (reg[1].equals("2")) {
				gender = "여";
			}
			
			list.add(new Member(name, birth, gender, age, phone));
		}
		sc.close();
		
		System.out.println("이름\t생년월일\t\t전화\t\t성별\t나이");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getName() + "\t");
			System.out.print(list.get(i).getBirth() + "\t");
			System.out.print(list.get(i).getPhone() + "\t");
			System.out.print(list.get(i).getGender() + "\t");
			System.out.print(list.get(i).getAge() + "\n");
		}
		
		System.out.println("\n총 인원수 : " + list.size() + "명");
	}

}
