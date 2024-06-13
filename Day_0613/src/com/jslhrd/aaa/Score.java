package com.jslhrd.aaa;

public class Score extends Student {
	int kor;
	int eng;
	int math;
	int tot;
	
	public Score(int bun, String name, int kor, int eng, int math) {
		super(bun, name);
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		tot = kor + eng + math;
	}
	
	void scorePrint() {
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\n", bun, name, kor, eng, math, tot);
	}
	
	void scorePrint2() {
		super.stuPrint();
		System.out.printf("%d\t%d\t%d\t%d\n", kor, eng, math, tot);
	}
	
	@Override
	void stuPrint() {
		super.stuPrint();
		System.out.printf("%d\t%d\t%d\t%d\n", kor, eng, math, tot);
	}
}
