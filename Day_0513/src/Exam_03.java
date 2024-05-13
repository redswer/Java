import java.util.Arrays;

public class Exam_03 {

	public static void main(String[] args) {
		// 배열의 복제
		
		int a[] = {10, 20, 30, 40, 50};
		
		// 1. for
		int b[] = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		System.out.println("a[] : " + Arrays.toString(a));
		System.out.println("b[] : " + Arrays.toString(b));
		
		System.out.println();
		
		a[1] = 100;
		System.out.println("a[] : " + Arrays.toString(a));
		System.out.println("b[] : " + Arrays.toString(b));
		
		System.out.println();
		
		// 2. Object 클래스의 clone() 메서드 활용
		int c[] = a.clone();
		System.out.println("a[] : " + Arrays.toString(a));
		System.out.println("c[] : " + Arrays.toString(c));
	}

}
