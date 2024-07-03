package com.jslhrd.aaa;

import java.io.*;

// 바이트 데이터 파일 저장
public class Exam_01 {

	public static void main(String[] args) {
		File file = new File("src/test.txt");
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			byte[] data = {66, 68, 70, 72, (byte)'!'};
			
			fos.write(data);
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
