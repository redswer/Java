package com.jslhrd.aaa;

import java.io.*;

public class Exam_04 {

	public static void main(String[] args) throws Exception {
		DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(new File("src/data.txt"))));
		
		int a = 0;
		double b = 0.0;
		byte[] by = null;
		
		try {
			a = dis.readInt();
			b = dis.readDouble();
			
			by = new byte[20];
			dis.read(by);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(new String(by));
	}

}
