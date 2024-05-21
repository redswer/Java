
public class Exam_02 {
	
	static void a() {
		int osum = 0;
		int esum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				osum += i;
			} else {
				esum += i;
			}
		}
		
		System.out.println("홀수합 : " + osum);
		System.out.println("짝수합 : " + esum);
	}
	
	public static void main(String[] args) {
		// 1 ~ 100 까지의 홀수 합, 짝수 합 출력
		
		a();
	}

}
