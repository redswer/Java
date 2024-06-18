package com.jslhrd.bbb;

import java.util.Scanner;

public class Sawon {
	int bun;
	String name;
	String birth;
	String gender;
	int pay;
	
	int age;
	Sawon[] s = new Sawon[10];
	int cnt = 0;
	
	public Sawon() {}
	
	public Sawon(int bun, String name, String birth, String gender, int pay) {
		this.bun = bun;
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.pay = pay;
	}
	
	void input() {
		Scanner sc = new Scanner(System.in);
		
		while(cnt < 10) {
			System.out.print("사원입력 : ");
			String[] sa = sc.nextLine().split(",");
			if (sa[0].equals("9999")) {
				break;
			}
			
			Sawon person = new Sawon(Integer.parseInt(sa[0]), sa[1], sa[2], sa[3], Integer.parseInt(sa[4]));
			s[cnt] = person;
			cnt++;
		}
	}
	
	void birth() {
		for (int i = 0; i < cnt; i++) {
			String year = s[i].birth.substring(0, 4) + "년 ";
			String month = s[i].birth.substring(4, 6) + "월 ";
			String day = s[i].birth.substring(6, 8) + "일 ";
			
			s[i].birth = year + month + day;
			s[i].age = 2024 - Integer.parseInt(year.substring(0, 4)) + 1;
		}
	}
	
	void gender() {
		for (int i = 0; i < cnt; i++) {
			String gender = "여자";
			if (s[i].gender.equalsIgnoreCase("m")) {
				gender = "남자";
			}
			
			s[i].gender = gender;
		}
		
	}
	
	double cal_age() {
		int sum = 0;
		double age_evg = 0;
		for (int i = 0; i < cnt; i++) {
			sum += s[i].age;
		}
		
		age_evg = (double)sum / cnt;
		
		return age_evg;
	}
	
	double cal_pay() {
		int sum = 0;
		double pay_evg = 0;
		for (int i = 0; i < cnt; i++) {
			sum += s[i].pay;
		}
		
		pay_evg = (double)sum / cnt;
		
		return pay_evg;
	}
	
	void print() {
		birth();
		gender();
		
		System.out.println("사원번호\t이름\t생년월일\t\t나이\t성별\t급여");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%d\t%s\t%s\t%d\t%s\t%d\n", s[i].bun, s[i].name, s[i].birth, s[i].age, s[i].gender, s[i].pay);
		}
		
		System.out.printf("평균나이 : %.2f세\n", cal_age());
		System.out.printf("평균급여 : %.2f원\n", cal_pay());
	}
}
