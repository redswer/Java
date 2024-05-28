class AA {
	int bun;
	String name;
	int age;
	
	AA() {
		this(10); // => AA(int bun) 생성자 호출
	}
	
	AA(int bun) {
		this(bun, "이사원");
		this.bun = bun;
	}
	
	AA(int bun, String name) {
		this.bun = bun;
		this.name = name;
	}
	
	AA(int bun, String name, int age) {
		this.bun = bun;
		this.name = name;
		this.age = age;
	}
}
public class Exam_02 {

	public static void main(String[] args) {
		AA a = new AA();
	}

}
