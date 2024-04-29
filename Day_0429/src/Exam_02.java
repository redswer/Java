
public class Exam_02 {

	public static void main(String[] args) {
		// '*' 25개, 한 줄에 5개씩 출력
		
		for (int i = 1; i <= 25; i++) {
			System.out.print("*");		
			
			if (i % 5 == 0) {
				System.out.println("");
			}
		}
		
		System.out.println("---------------------------------");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i + " ");
			}
			
			System.out.println();
		}
	}

}
