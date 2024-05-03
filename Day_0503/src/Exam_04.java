
public class Exam_04 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			if (i < 5) {
				for (int j = 1; j <= 5 - i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 2 * i - 1; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = i - 5; j >= 1; j--) {
					System.out.print(" ");
				}
				for (int j = 11 - (i - 4) * 2; j >= 1; j--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
