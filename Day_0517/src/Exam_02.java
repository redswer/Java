
public class Exam_02 {
	public static void main(String[] args) {
		/*   1  2  3  4  5
		 *  10  9  8  7  6
		 *  11 12 13 14 15
		 *  20 19 18 17 16
		 *  21 22 23 24 25
		 */
		int arr[][] = new int[5][5];
		int cnt = 1;
		int b = 0; // 초기값
		int n = 1; // 증가값
		int m = arr.length - 1;
		
		for(int i = 0; i < arr.length; i++) {
			for (int j = b; j != m + n; j += n) {
				arr[i][j] = cnt;
				cnt++;
			}
			n *= -1;
			int tmp = b;
			b = m;
			m = tmp;
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
