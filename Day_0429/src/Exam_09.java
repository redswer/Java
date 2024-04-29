
public class Exam_09 {

	public static void main(String[] args) {
		/*   1  2  3  4  5  15
		 *   6  7  8  9 10  40
		 *  11 12 13 14 15  65
		 *  16 17 18 19 20  90
		 *  21 22 23 24 25  115 
		 * */

		int cnt = 1;
		
		for (int i = 1; i <= 5; i++) {
			int sum = 0;
			for (int j = 1; j <= 5; j++) {
				System.out.printf("%3d", cnt);
				sum += cnt;
				cnt++;
			}
			System.out.printf("%4d\n", sum);
		}
	}

}
