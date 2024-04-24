
public class Exam_03 {

	public static void main(String[] args) {
		// 1 ~ 10 까지의 합
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		System.out.println("-------------------------");
		
		// 홀수의 합 구하기
		
		sum = 0;
		for (int i = 1; i < 10; i += 2) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}
