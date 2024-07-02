package com.jslhrd.aaa;

import java.util.*;

public class Exam_02 {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("Oracle");
		list.add("Servlet");
		list.add("JSP");
		list.add("Spring");
		
		System.out.println("------------List 출력-------------");
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("------------List 출력-------------");
		list.forEach(x->System.out.println(x));
	}

}
