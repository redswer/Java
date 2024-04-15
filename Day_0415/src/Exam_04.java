
public class Exam_04 {

	public static void main(String[] args) {
		// print("*"), print("\n") 을 이용하여 첫째줄엔 하나 둘째줅엔 두개 ..... 5번째 줄까지 출력
		
		System.out.print("*");
		System.out.print("\n");
		// System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.print("\n");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("\n");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("\n");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		
		System.out.println("\n-------------------------");
		
		for (int i = 1; i <= 5;i++) {
			for (int j = 1; j <= 5; j++) {
				if (i >= j) {
					System.out.print("*");					
				}
			}
			System.out.print("\n");
		}
	}

}
