package com.jslhrd.aaa;

class CC {
	int x;
	
	CC(int x) {
		this.x = x;
	}
	
	@Override
	public int hashCode() {
		return x;
	}
}

public class Exam_03 {

	public static void main(String[] args) {
		CC c1 = new CC(100);
		CC c2 = new CC(200);
		
		System.out.println("c1.hashCode() : " + c1.hashCode());
		System.out.println("c2.hashCode() : " + c2.hashCode());
		
		String s1 = "AAA";
		String s2 = "AAA";
		String s3 = "BBB";
		
		System.out.println("s1.hashCode() : " + s1.hashCode());
		System.out.println("s2.hashCode() : " + s2.hashCode());
		System.out.println("s3.hashCode() : " + s3.hashCode());
	}

}
