package com.jslhrd.bbb;

import java.util.*;

public class Exam_01 {

	public static void main(String[] args) {
		List<User> list = new ArrayList();
		Scanner sc = new Scanner(System.in);

		list.add(new User("user01", "AAA", 24));
		list.add(new User("user02", "BBB", 30));
		list.add(new User("user03", "CCC", 28));
		list.add(new User("user04", "DDD", 26));
		list.add(new User("user05", "EEE", 31));
		list.add(new User("user06", "FFF", 29));
		
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getAge() > list.get(j).getAge()) {
					User u = list.get(i);
					list.set(i, list.get(j));
					list.set(j, u);
				}
			}
		}
		
		System.out.println("아이디\t이름\t나이");
		for(User u : list) {
			System.out.printf("%s\t%s\t%d\n", u.getId(), u.getName(), u.getAge());
		}
	}

}
