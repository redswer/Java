package com.jslhrd.aaa;

import java.io.*;

// 파일로부터 텍스트 읽기
public class Exam_06 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(new File("src/output.txt")));
		
//		String str = "";
//		
//		while((str = br.readLine()) != null) {
//			System.out.println(str);
//		}
		
		while(true) {
			String str = br.readLine();
			if (str == null) {
				break;
			}
			System.out.println(str);
		}
		
		br.close();
	}

}
