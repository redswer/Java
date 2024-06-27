package com.jslhrd.aaa;

import java.util.*;

public class Exam_03 {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();
		
		boolean bool = set.add(new Person(1, "aaa", 30));
		System.out.println(bool);
		
		bool = set.add(new Person(2, "aaa", 30));
		System.out.println(bool);
		
		bool = set.add(new Person(2, "aaa", 30));
		System.out.println(bool);
		// => Person 에서 hashCode() 와 equals() 메소드 오버라이딩 해야 함
	}

}
