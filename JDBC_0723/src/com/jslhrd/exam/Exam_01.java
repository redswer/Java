package com.jslhrd.exam;

import com.jslhrd.model.ExamDAO;

public class Exam_01 {

	public static void main(String[] args) {
		ExamDAO dao = new ExamDAO();
		System.out.println(dao.createTable());
	}

}
