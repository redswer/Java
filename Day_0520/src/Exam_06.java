
public class Exam_06 {

	public static void main(String[] args) {
		int num = 50;
		odd(num); // 1 ~ num 까지의 수 중 홀수만 출력
		System.out.println("\n----------------------------------------------------------------------------------");
		even(num); // '' 짝수만 출력
		// => 메서드 작성
	}
	
	static void odd(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
	}
	
	static void even(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
