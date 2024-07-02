package com.jslhrd.bbb;

import java.io.File;
import java.io.IOException;

public class Exam_02 {

	public static void main(String[] args) {
		File f1 = new File("C:/Users/admin/ajh");
		
		if (!f1.exists()) {
			f1.mkdir();
		}
		
		try {
			Thread.sleep(3000); // 3초간 정지
		} catch (Exception e) {
			File f2 = new File(f1, "abc.txt");
			if (!f2.exists()) {
				try {
					f2.createNewFile();
				} catch (IOException e1) {
					System.out.println("경로를 찾을 수 없음");
				}
			}
			
			if (f2.canWrite()) {
				f2.setReadOnly();
			}
		}
	}

}
