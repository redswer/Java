
public class Exam_11 {

	public static void main(String[] args) {
		// 구구단 모두 출력(2단 ~ 9단)
		
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
	}

}
