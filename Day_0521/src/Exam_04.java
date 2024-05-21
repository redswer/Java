
public class Exam_04 {
	static void max(int a, int b) {
		int max = a;
		
		if (b > max) {
			max = b;
		}
		
		System.out.printf("max : %d\n", max);
	}
	
	static void max(int a, int b, int c) {
		int max = a;
		
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		
		System.out.printf("max : %d\n", max);
	}
	
	static void max(int a, int b, int c, int d) {
		int max = a;
		
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (d > max) {
			max = d;
		}
		
		System.out.printf("max : %d\n", max);
	}

	public static void main(String[] args) {
		int a = 5, b = 3, c = 7, d = 2;
		
		max(a, b);
		max(a, b, c);
		max(a, b, c, d);
	}

}
