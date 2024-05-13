import java.util.Arrays;

public class Exam_06 {

	public static void main(String[] args) {
		// 버블 정렬
		
		int a[] = {6, 9, 8, 7, 4};		

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}
		System.out.print(Arrays.toString(a));
	}

}
