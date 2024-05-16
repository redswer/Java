
public class Exam_08 {

	public static void main(String[] args) {
		/*              1
		 * 		     2  3
		 * 	      4  5  6
		 *    7   8  9 10
		 * 11 12 13 14 15
		 * */
		int arr[][] = new int[5][5];

		int cnt = 1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 4 - i; j < arr[i].length; j++) {
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
