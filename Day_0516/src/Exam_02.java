
public class Exam_02 {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5};
		int arr[][] = {{1, 2, 3}, {4, 5, 6}};
		
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%3d", a[i]);
		}
		
		System.out.println("\n---------------------");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
