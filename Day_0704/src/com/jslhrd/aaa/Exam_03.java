package com.jslhrd.aaa;

import java.util.*;
import java.io.*;

// 컬렉션 -> 파일
public class Exam_03 {

	public static void main(String[] args) throws Exception {
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("Oracle");
		list.add("JSLHRD");
		list.add("DataBase");
		list.add("Spring");
		
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("src/listObject.txt"))));
		
		oos.writeObject(list);
		oos.close();
	}

}
