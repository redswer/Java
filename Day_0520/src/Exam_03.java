
public class Exam_03 {
	// 메서드 (함수) : 특정한 기능(작업)을 수행하기 위한 명령문의 집합
	// 반환타입 + 메서드 이릅 + 매개변수
	
	static void test() { //=> main 과 동급의 메서드는 static 붙여야 함
		System.out.println("test 메서드 호출됨");
		return;
	}

	public static void main(String[] args) {
		test();
	}

}
