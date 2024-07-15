package com.jslhrd.test;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.model.ExamDAO;

public class Exam_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ExamDAO dao = new ExamDAO();
		
		System.out.print("검색 : ");
		String name = sc.nextLine().toUpperCase();
		
		List<String> list = dao.find_name(name);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
