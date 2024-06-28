package com.jslhrd.aaa;

import java.util.*;

public class Exam_04 {

	public static void main(String[] args) {
		Map<Person, Integer> map = new HashMap<>();
		
		map.put(new Person(1, "aaa"), 90);
		map.put(new Person(1, "sss"), 80);
		// => Person 에서 equals 와 hashCode 를 override 했기 때문에 번호가 같으면 같은 객체로 인식
		map.put(new Person(2, "bbb"), 80);
		map.put(new Person(3, "ccc"), 90);
		map.put(new Person(5, "ddd"), 85);
		map.put(new Person(4, "sss"), 95);
		
		System.out.println("번호\t이름\t점수");
		Set<Person> set = map.keySet();
		
		for (Person p : set) {
			System.out.print(p + "\t");
			System.out.print(map.get(p) + "\n");
		}
	}

}
