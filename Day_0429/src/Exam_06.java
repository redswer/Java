
public class Exam_06 {

	public static void main(String[] args) {
		/* 1
		 * 2 2
		 * 3 3 3
		 * 4 4 4
		 * 5 5 5 5 5
		 * -----------------
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 * 1 2 3 4 5
		 * -----------------
		 *  1
		 *  2  3
		 *  4  5  6
		 *  7  8  9 10
		 * 11 12 13 14 15
		 * */
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%3d", i);
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%3d", j);
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------");
		int cnt = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%3d", cnt);
				cnt++;
			}
			System.out.println();
		}
	}

}
