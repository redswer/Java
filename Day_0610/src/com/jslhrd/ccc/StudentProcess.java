package com.jslhrd.ccc;

public class StudentProcess {
	
	public void changeGender(Student[] st, int cnt) {
		for (int i = 0; i < cnt; i++) {
			if(st[i].getGender().equals("M") || st[i].getGender().equals("m")) {
				st[i].setGender("남자");
			} else if (st[i].getGender().equals("F") || st[i].getGender().equals("f")) {
				st[i].setGender("여자");
			}
		}
	}
	
	public void sort(Student[] st, int cnt) {
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = cnt + 1; j < cnt; j++) {
				if (st[i].getScore() > st[j].getScore()) {
					Student tmp = st[i];
					st[i] = st[j];
					st[j] = tmp;
				}
			}
		}
	}
	
	public void print(Student[] st, int cnt) {
		changeGender(st, cnt);
		
		System.out.println("학번\t이름\t성별\t점수");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%s\t%s\t%s\t%d\n", st[i].getBun(), st[i].getName(), st[i].getGender(), st[i].getScore());
		}
	}
}
