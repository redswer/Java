package com.jslhrd.bbb;

import java.util.Scanner;

public class MemberData {
	int cnt = 0;
	Member[] m = new Member[10];
	
	void input() {
		Scanner sc = new Scanner(System.in);
		
		while(cnt < 10) {
			System.out.print("자료입력 " + (cnt + 1) + ":");
			String[] me = sc.nextLine().split(",");
			
			if (me[0].equals("end")) {
				break;
			}
			
			Member person = new Member(me[0], me[1], me[2]);
			m[cnt] = person;
			cnt++;
		}
	}
	
	void gender() {
		for (int i = 0; i < cnt; i++) {
			switch (m[i].ssn.substring(7)) {
			case "1":
			case "3":
			case "5":
			case "7":
				m[i].gender = "남";
				break;

			default:
				m[i].gender = "여";
				break;
			}
		}
	}
	
	void age() {
		for (int i = 0; i < cnt; i++) {
			int age = 0;
			if (Integer.parseInt(m[i].ssn.substring(0, 2)) < 25) {
				age = 24 - Integer.parseInt(m[i].ssn.substring(0, 2)) + 1;
			} else {
				age = 2024 - (1900 + Integer.parseInt(m[i].ssn.substring(0, 2))) + 1;
			}
			
			m[i].age = age;
		}
	}
	
	void print() {
		gender();
		age();
		
		System.out.println("이름\t전화\t\t성별\t나이");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%s\t%s\t%s\t%d\n", m[i].name, m[i].phone, m[i].gender, m[i].age);
		}
	}
}
