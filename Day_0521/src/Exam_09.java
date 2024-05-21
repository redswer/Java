
public class Exam_09 {
	static void scoreSum(int[] a) {
		int sum = 0;
		
		for (int i = 0; i < a.length - 1; i++) {
			System.out.printf("%d, ", a[i]);
		}
		
		System.out.print(a[a.length - 1] + "합 = ");
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		System.out.print(sum + "\n");
	}
	
	static void scoreMaxMin(int[] a) {
		int max = a[0];
		int min = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			} else if (a[i] < min) {
				min = a[i];
			}
		}
		
		System.out.printf("최대값 = %d, 최소값 = %d\n", max, min);
	}
	
	static void MaxMedMin(int a, int b, int c) {
		if (a < b) {
			int t = a;
			a = b;
			b = t;
		}
		
		if (a < c) {
			int t = a;
			a = c;
			c = t;
		}
		
		if (b < c) {
			int t = b;
			b = c;
			c = t;
		}
		
		System.out.printf("max = %d, med = %d, min = %d", a, b, c);
	}
	
	public static void main(String[] args) {
		int score[]= {10, 90, 88, 75, 46, 79, 55};
		int a = 80, b = 90, c = 85;
		
		// 1. score 배열의 내용을 출력 후 합을 구하여 출력
		// => 10, 90, 88, 75, 46, 79, 55 합 = xx
		scoreSum(score);
		
		// 2. score 배열의 내용을 출력 후 최대값, 최소값을 구하여 출력
		// => 10, 90, 88, 75, 46, 79, 55
		// => 최대값 = 90, 최소값 = 10
		scoreMaxMin(score);
		
		// 3. a, b, c 값을 이용하여 대, 중, 소 를 구하여 출력
		// a = 80, b = 90, c = 85
		// => max = 90, med = 85, min = 80
		MaxMedMin(a, b, c);
	}

}
