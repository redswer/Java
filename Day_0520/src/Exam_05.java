
public class Exam_05 {
	public static void main(String[] args) {
		exam(10);
		System.out.println(exam2(10));
		
		// 각각 1 ~ n(매개변수) 까지의 합이 출력되도록 작성
	}
	
	//1 exam(10)
	static void exam(int n) {
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}
	
	// 2. exam2(10)
	static int exam2(int n) {
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		return sum;
	}
}
