package com.jslhrd.aaa;

import java.util.*;

public class Exam_01 {

	public static void main(String[] args) {
//		List list = new List();
		List list = new ArrayList();
		ArrayList aList = new ArrayList();

		// add() : 데이터 추가
		list.add(1);
		list.add("Korea");
		list.add(3.14);
		
		// set() : 데이터 수정
		list.set(1, "JSL");
		
		System.out.println(list);
		
		// get() : 데이터 추출
		int a = (int)(list.get(0));
		Object o = list.get(0);
		
		// remove() : 데이터 제거
		boolean bool = list.remove((Object)1);
		boolean bool2 = list.remove(list.get(2));
		
		if (bool) {
			System.out.println("삭제됨");
		}
		
		System.out.println(list);
	}

}
