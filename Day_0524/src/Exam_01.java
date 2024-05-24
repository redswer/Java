
public class Exam_01 {
	static void function() {
		System.out.println("Hello World");
		
		function();
	}

	public static void main(String[] args) {
		// 재귀메서드(함수) : Recursion
		
		function();
		// => 무한대로 호출됨
	}

}
