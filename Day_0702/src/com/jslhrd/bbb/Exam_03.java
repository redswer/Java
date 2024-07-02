package com.jslhrd.bbb;

import java.io.File;
import java.util.Date;

public class Exam_03 {

	public static void main(String[] args) {
		File f = new File("src/com/jslhrd/bbb/Exam_01.java");
		
		if (f.exists()) {
			System.out.println("파일명 : " + f.getName());
			System.out.println("파일경로 : " + f.getPath());
			System.out.println("파일경로 : " + f.getParent());
			System.out.println("파일크기 : " + f.length());
			System.out.println("최종수정일 : " + new Date(f.lastModified()));
		} else {
			System.out.println("파일이 존재하지 않음");
		}
	}

}
