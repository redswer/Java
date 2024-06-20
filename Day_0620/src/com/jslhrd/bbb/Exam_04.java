package com.jslhrd.bbb;

class AA {
	public int eno;
	
	public AA(int eno) {
		this.eno = eno;
		
		System.out.println("AA (" + eno + ") 가 메모리에 생성됨");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("AA (" + eno + ") 가 메모리에서 제거됨");
	}
}

public class Exam_04 {

	public static void main(String[] args) {
		AA aa = new AA(1);
		aa = new AA(2);
		aa = new AA(3);
		aa = new AA(4);
		
		System.out.println(aa.eno);
		System.gc();
	}

}