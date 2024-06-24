package com.jslhrd.aaa;

import java.util.*;

public class Exam_02 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		// => <> : Generic (타입 지정)
		
//		list.add("1");
		list.add(90);
		list.add(60);
		list.add(40);
		list.add(30);
		list.add(70);
		
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		// 리스트를 반복자로 변환
		Iterator<Integer> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		
		// 확장 for문
		for(Integer a : list) {
			System.out.print(a + " ");
		}
	}

}
