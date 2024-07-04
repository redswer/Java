package com.jslhrd.aaa;

import java.io.*;
// 객체 입출력

class Point implements Serializable { //=> 객체를 byte 배열에 담아야 함 (Serializable)
	int x;
	int y;
}
public class Exam_01 {

	public static void main(String[] args) throws Exception {
		Point p = new Point();
		p.x = 100;
		p.y = 200;
		
//		File dir = new File("src/object.txt");
		File dir = new File("src/");
		File file = new File(dir, "object.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(p);
		
		oos.close();
	}

}
