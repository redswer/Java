package com.jslhrd.bbb;

import java.io.File;

public class Exam_01 {

	public static void main(String[] args) throws Exception {
		File f1 = new File("C:/Users/admin/ajh");
		
		if (f1.exists()) {
			f1.delete();
			System.out.println("ajh 폴더 삭제됨");
		} else {
			System.out.println("ajh 폴더가 없음");
		}
	}

}
