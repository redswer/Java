package com.jslhrd.ccc;

import java.util.*;

public class MemberExam {

	public static void main(String[] args) {
		List<Member> list = new ArrayList<>();
		
		list.add(new Member(7, "bbb"));
		list.add(new Member(1, "aaa"));
		list.add(new Member(5, "ddd"));
		list.add(new Member(3, "fff"));
		list.add(new Member(2, "kkk"));
		
		System.out.println("list : " + list);
		System.out.println("----------------------------------------------");
		Collections.sort(list);
		System.out.println("list : " + list);
	}

}
