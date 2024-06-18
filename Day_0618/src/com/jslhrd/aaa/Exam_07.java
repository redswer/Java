package com.jslhrd.aaa;

import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] per = new Person[3];
		
		for (int i = 0; i < per.length; i++) {
			System.out.println("등록 : ");
			String str[] = sc.nextLine().split(" ");
			
			Person p = new Person(Integer.parseInt(str[0]), str[1], str[2]);
			per[i] = p;
		}
		
		System.out.println("번호\t이름\t성별");
		for (int i = 0; i < per.length; i++) {
			System.out.println(per[i]);
		}
	}

}
