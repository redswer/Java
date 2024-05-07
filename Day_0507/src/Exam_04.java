// 배열요소 출력
import java.util.Arrays;

public class Exam_04 {

	public static void main(String[] args) {		
		int a[] = {4, 6, 9, 3, 6, 7};
		
		// Array.toString()
		System.out.println(Arrays.toString(a));
		
		// 기본 for()
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%3d", a[i]);
		}
		System.out.println();
		
		// 확장 for()
		for(int i: a) {
			System.out.printf("%3d", i);
		}
	}

}
