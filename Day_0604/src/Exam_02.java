class BB {
	int bun;
	String name;
	
	BB() {
	}
	
	BB(int bun, String name) {
		this.bun = bun;
		this.name = name;
	}
	
	void bbPrint() {
		System.out.print(bun + "\t" + name);
	}
}

class BBB {
	BB bb;
	int kor;
	int eng;
	int math;
	
	BBB(){
	}
	
	BBB(BB bb, int kor, int eng, int math) {
		this.bb = bb;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	void bbbPrint() {
		bb.bbPrint();
		System.out.print("\t" + kor + "\t" + eng + "\t" + math + "\n");
	}
}


public class Exam_02 {

	public static void main(String[] args) {
		BB b = new BB(1, "aaa");
		BBB bbb = new BBB(b, 90, 70, 80);
		
		BBB bbb2 = new BBB(new BB(2, "ccc"), 70, 70, 70);
		
		bbb.bbbPrint();
		bbb2.bbbPrint();
	}

}
