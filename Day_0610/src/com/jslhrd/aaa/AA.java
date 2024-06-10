package com.jslhrd.aaa;

public class AA {
	private int a = 10;
	int b = 20;	// default
	protected int c = 30;
	public int d = 40;
	
	private void printA() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
	
	void printB() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
	
	protected void printC() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
	
	public void printD() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
	// => 같은 클래스에서는 접근 제어에 상관없이 변수 사용 가능
}
