
public class Exam_04 {

	public static void main(String[] args) {
		int s = 0;
		
		for (int i = 1; i <= 10 ; i++) {
			if (i % 2 == 1) {
				s += i;
			}
		}
		
		System.out.println("홀수의 합 : " + s);
		
		System.out.println("----------------------------");
		
		s = 0;
		
		for (int i = 1; i <= 10 ; i++) {
			if (i % 2 == 0) {
				s += i;
			}
		}
		
		System.out.println("짝수의 합 : " + s);
		
		System.out.println("----------------------------");
		
		// 동시계산
		
		s = 0;
		int a = 0;
		
		for (int i = 1; i <= 10 ; i++) {
			if (i % 2 == 1) {
				s += i;
			} else {
				a += i;
			}
		}
		
		System.out.println(s);
		System.out.println(a);
	}

}
