class Person {
	int bun;
	String name;
	int age;
	
	Person () {} // => 밑에 매개변수가 있는 생성자가 있으므로 default 생성자를 직접 입력
	
	Person(int bun, String name, int age) {
		this.bun = bun;
		this.name = name;
		this.age = age;
	}
	
	void print() {
		System.out.println("번호 : " + this.bun);
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
	}
}

public class Exam_01 {

	public static void main(String[] args) {
		Person p = new Person(); // => Person() : default 생성자(메서드)
		p.bun = 10;
		p.name = "김사원";
		p.age = 30;
		
		Person p1 = new Person(100, "이사원", 28); // => 생성과 동시에 초기화
		
//		System.out.println("번호 : " + p.bun);
//		System.out.println("이름 : " + p.name);
//		System.out.println("나이 : " + p.age);
//		System.out.println("----------------------");
//		System.out.println("번호 : " + p1.bun);
//		System.out.println("이름 : " + p1.name);
//		System.out.println("나이 : " + p1.age);
		
		p.print();
		System.out.println("-----------------");
		p1.print();
	}

}
