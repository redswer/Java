
public class Exam_04 {

	public static void main(String[] args) {
		int a= 7, b = 3;
		int c;
		double d;
		
		c = a * b;
		System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);
		
		c = a / b;
		System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);
		
		c = (int)(a / 3.0);
		d = a / (double) b;
		System.out.printf("a = %d, b = %d, c = %d, d = %f\n", a, b, c, d);
	}

}
