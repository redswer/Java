package com.jslhrd.aaa;

import java.io.*;

// 기본자료형 파일 출력
public class Exam_03 {

	public static void main(String[] args) throws Exception {
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File("src/data.txt"))));
		
		dos.writeInt(100);
		dos.writeDouble(3.14);
		dos.writeBytes("Hello World!");
		dos.close();
	}

}
