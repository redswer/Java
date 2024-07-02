package com.jslhrd.bbb;

import java.io.File;

public class Exam_04 {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir"); //=> 현재 프로젝트 경로
		System.out.println(path);
		
		File file = new File(path);
		String[] flist = file.list();
		for(String s : flist) {
			System.out.println(s);
		}
		
		System.out.println("--------------------------");
		File f2 = new File(file + "/src/com/jslhrd/aaa");
		String[] str = f2.list();
		for (String s : str) {
			System.out.println(s);
		}
	}

}
