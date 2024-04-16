
public class Exam_01 {

	public static void main(String[] args) {
		// 식별자(Identifier) : 클래스 이름, 메소드 이름, 변수명
		/* 1. 사용가능 영문자(대소문자 구분), 숫자(0~9), 특수문자(_ , $) 만 가능
		 * 2.  첫 글자는 반드시 영문자
		 */
		
		// 변수 선언
		byte by; // 1 byte = 8 bit
		short sh; // 2
		char ch; // 2
		int i;  // 4
		long lo; // 8
		float fl; // 4
		double dl; // 8
		boolean bool; // 1
		
		by = 100;
		sh = 30000;
		ch = 'A'; ch = 5;
		i = 12345678;
		lo = 1234567890;
		// fl = 3.14;
		fl = (float) 3.14; fl = 3.14f;
		dl = 3.14;
		bool = true;
		
		System.out.println("by = " + by);
		System.out.println("sh = " + sh);
		System.out.println("ch = " + ch);
		System.out.println("i = " + i);
		System.out.println("lo = " + lo);
		System.out.println("fl = " + fl);
		System.out.println("dl = " + dl);
		System.out.println("bool = " + bool);
	}

}
