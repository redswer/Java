
public class Exam_04 {

	public static void main(String[] args) {
		
		int cnt = 1;
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.printf("%3d", cnt);
				cnt++;
			}
			
			System.out.println();
		}
	}

}
