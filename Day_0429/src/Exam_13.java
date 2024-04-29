
public class Exam_13 {

	public static void main(String[] args) {
		/*
		 *   1  2  3  4  5
 			10  9  8  7  6
 			11 12 13 14 15
 			20 19 18 17 16
 			21 22 23 24 25
		 * */
		int cnt = 1;
		
		for (int i = 1; i <= 5; i++) {
			if (i % 2 == 1) {
				for (int j = 1; j <= 5; j++) {			
					System.out.printf("%3d", cnt);
					cnt++;
				}
			} else {
				for (int j = i * 5; j >= i * 5 - 4; j--) {
					System.out.printf("%3d", j);
					cnt++;
				}
			}
			System.out.println();
		}
	}

}
