package com.jslhrd.aaa;

import java.io.*;

// 파일로부터 읽기
public class Exam_02 {

	public static void main(String[] args) {
		File file = new File("src/test.txt");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			byte[] data = new byte[1000];
			int cnt = fis.read(data); // 읽어들인 byte 수 (글자수)
			
			for (int i = 0; i < cnt; i++) {
				System.out.println(i + " : " + (char)data[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
