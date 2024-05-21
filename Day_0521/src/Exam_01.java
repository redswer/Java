
public class Exam_01 {
	static void a() {
		System.out.println("a() 호출됨");
	}
	
	static void b(int a, int b) { 
		// => static : 메인 메서드와 같은 클래스에 있는 메서드에는 붙여야 함, void : 반환타입, b : 메서드 이름, a/b : 매개변수
		System.out.printf("a = %d, b = %d\n", a, b);
	}
	
	public static void main(String[] args) {
		a();
		b(10, 20);
	}

}
