
public class Exam_05 {

	static int add(int n) {
		int sum = 0;
		
		for (int i = 1; i < n; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int a = 10;
		
		System.out.printf("1 ~ %d 까지의 합 : %d", a, add(a));
	}

}
