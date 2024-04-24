
public class Exam_05 {

	public static void main(String[] args) {
		// 1 + 2 + 3 + 4 + 5 = 15 출력
		
		int s = 0;
		
		for (int i = 1; i <= 5 ; i++) {
			if (i != 5) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = ");
			}
			s += i;
		}
		
		System.out.print(s);
	}

}
