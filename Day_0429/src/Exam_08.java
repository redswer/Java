
public class Exam_08 {

	public static void main(String[] args) {
		/*    1  2  3  4  5
		 *    6  7  8  9 10
		 *   11 12 13 14 15
		 *   16 17 18 19 20
		 *   21 22 23 24 25
		 *   ------------------
		 *                1
		 *             2  3
		 *          4  5  6
		 *       7  8  9 10
		 *   11 12 13 14 15
		 * */
		
		int cnt = 1;
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.printf("%3d", cnt);
				cnt++;
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		cnt = 1;
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j <= 5 - i; j++) {
				System.out.printf("   ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.printf("%3d", cnt);
				cnt++;
			}
			System.out.println();
		}
		
	}

}
