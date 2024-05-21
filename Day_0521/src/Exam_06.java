
public class Exam_06 {
	static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
	}

	public static void main(String[] args) {
		int a = 10, b = 20;		
		System.out.printf("a = %d, b = %d\n", a, b);
		
		swap(a, b);
		System.out.printf("a = %d, b = %d\n", a, b);
		// => 값에 의한 호출
		// => main 메서드의 변수 a, b 와 swap 메서드의 변수 a, b 는 이름만 같은 별개의 변수
	}

}
