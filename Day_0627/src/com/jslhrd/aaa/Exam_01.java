package com.jslhrd.aaa;

import java.util.*;

public class Exam_01 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		boolean bool = set.add("BBBB");
		System.out.println(bool);
		
		boolean bool2 = set.add("BBBB");
		System.out.println(bool2);
		// => 중복 x
		
		set.add("Java");
		set.add("JSLHRD");
		set.add("Serverlt");
		set.add("DataBase");
		
		System.out.println(set);
		// => 순서 없음 (입력 순서대로 x)
		
		
		// 출력
		// 1. 확장 for 문
		for(String s : set) {
			System.out.print(s + "  ");
		}
		System.out.println();
		
		// 2. Iterator 인터페이스로 변환하여 출력
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next() + "  ");
		}
		System.out.println();
		
		// 3. List 로 변환하여 출력
		List<String> list = new ArrayList<>(set);
		System.out.println(list);
		
		Collections.sort(list);
		//=>　알파벳 순으로 정렬
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "  ");
		}
	}

}
