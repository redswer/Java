
public class Exam_09 {

	public static void main(String[] args) {
		/* 1
		 * 3  2
		 * 6  5  4
		 * 10 9  8  7
		 * 15 14 13 12 11
		 * */
		int arr[][] = new int[5][5];
		
		int cnt = 1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i ; j >= 0 ; j--) {
				arr[i][j] = cnt;
				cnt++;
			}
		}
		
		for (int i[] : arr) {
			for (int j : i) {
				if (j == 0) {
					System.out.printf("%3s", " ");
				} else {
					System.out.printf("%3d", j);
				}
			}
			System.out.println();
		}
	}

}
