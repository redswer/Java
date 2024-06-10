package com.jslhrd.ccc;

import java.util.Scanner;

public class StudentProcess {
	Scanner sc = new Scanner(System.in);
	Student[] st = new Student[10];
	int cnt = 0;
	
	public void input() {
		while(cnt < 10) {
			System.out.print("등록 : ");
			String bun = sc.next();
			if (bun.equals("0000")) {
				break;
			}
			
			boolean dupCheck = false;
			for (int i = 0; i < cnt; i++) {
				if (bun.equals(st[i].getBun())) {
					System.out.println(">> 이미 등록된 학생입니다");
					dupCheck = true;
					break;
				}
			}
			
			if (dupCheck) {
				continue;
			}
			
			String name = sc.next();
			String gender = sc.next();
			int score = sc.nextInt();
			
			Student student = new Student(bun, name, gender, score);
			st[cnt] = student;
			
			cnt++;
		}
	}
	
	public void changeGender() {
		for (int i = 0; i < cnt; i++) {
			if(st[i].getGender().equalsIgnoreCase("m")) {
				st[i].setGender("남자");
			} else if (st[i].getGender().equalsIgnoreCase("f")) {
				st[i].setGender("여자");
			}
		}
	}
	
	public void sort() {
		Student[] copy = st.clone();
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = cnt + 1; j < cnt; j++) {
				if (copy[i].getScore() > copy[j].getScore()) {
					Student tmp = copy[i];
					copy[i] = copy[j];
					copy[j] = tmp;
				}
			}
		}
		
		System.out.println("학번\t이름\t성별\t점수");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%s\t%s\t%s\t%d\n", copy[i].getBun(), copy[i].getName(), copy[i].getGender(), copy[i].getScore());
		}
	}
	
	public void print() {
		changeGender();
		
		System.out.println("학번\t이름\t성별\t점수");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%s\t%s\t%s\t%d\n", st[i].getBun(), st[i].getName(), st[i].getGender(), st[i].getScore());
		}
	}
}
