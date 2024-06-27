package com.jslhrd.aaa;

import java.util.*;

public class Exam_02 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();

		set.add(55);
		set.add(75);
		set.add(45);
		set.add(95);
		set.add(85);
		set.add(60);
		
		System.out.println("set 이 비어있는가? : " + set.isEmpty());
		System.out.println("자료수 : " + set.size());
		System.out.println(set);
		System.out.println("55 포함 여부 : " + set.contains(55));
		System.out.println();
		System.out.println("55 제거 : " + set.remove(55));
		System.out.println(set);
		System.out.println("55 포함 여부 : " + set.contains(55));
		System.out.println();
		System.out.println("모두 제거 : " + set.removeAll(set));
		System.out.println("set 이 비어있는가? : " + set.isEmpty());
	}

}
