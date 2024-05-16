
public class Exam_03 {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5};
		int arr[][] = {{1, 2, 3}, {4, 5, 6}};
		
		for (int i : a) {
			System.out.printf("%3d", i);
		}
		
		System.out.println("\n---------------------");
		
		for (int i[] : arr) {
			for (int j : i) {
				System.out.printf("%3d", j);
			}
			System.out.println();
		}
	}

}
