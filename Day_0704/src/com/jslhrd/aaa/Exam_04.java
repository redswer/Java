package com.jslhrd.aaa;

import java.io.*;
import java.util.*;

public class Exam_04 {

	public static void main(String[] args) throws Exception {
		List<String> list = new ArrayList<>();
		// => ArrayList 에는 Serializable 이 implements 되어 있음
		
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("src/listObject.txt"))));
		
		list = (List)ois.readObject();
		
		for(String s : list) {
			System.out.println(s);
		}
	}

}
