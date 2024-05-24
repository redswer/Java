import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("줄수 입력 : ");
		int n = sc.nextInt();
		int cnt = 1;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i + 4; j++) {
				if (j <= n - i) {
					System.out.printf("%3s", " ");
				} else {
					System.out.printf("%3d", cnt);
					cnt++;
				}
			}
			System.out.println();
		}
	}

}
