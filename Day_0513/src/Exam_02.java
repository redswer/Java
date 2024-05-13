import java.util.Arrays;

public class Exam_02 {

	public static void main(String[] args) {
		// 배열의 공유
		
		int a[] = {10, 20, 30, 40, 50};
		int b[] = a;
		System.out.println("a[] : " + Arrays.toString(a));
		System.out.println("b[] : " + Arrays.toString(b));
		
		System.out.println();
		
		a[1] = 200;
		b[2] = 300;
		System.out.println("a[] : " + Arrays.toString(a));
		System.out.println("b[] : " + Arrays.toString(b));
	}

}
