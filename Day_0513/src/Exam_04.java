import java.util.Arrays;

public class Exam_04 {

	public static void main(String[] args) {
		int arr[] = {7, 5, 9, 8, 4};
		int arr2[] = arr.clone();
		System.out.println(Arrays.toString(arr));
		
		// 선택정렬
		// 1. 오름차순
		for (int i = 0; i < arr2.length; i++) {
			for (int j = i + 1; j < arr2.length; j++) {
				if(arr2[i] > arr2[j]) {
					int tmp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr2));
		
		// 2. 내림차순
		for (int i = 0; i < arr2.length; i++) {
			for (int j = i + 1; j < arr2.length; j++) {
				if(arr2[i] < arr2[j]) {
					int tmp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr2));
		
	}

}
