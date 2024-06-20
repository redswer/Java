package com.jslhrd.bbb;

public class Exam_06 {

	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println(javaHome);
		
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		String path = System.getProperty("user.dir");
		
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		System.out.println(path);
	}

}
