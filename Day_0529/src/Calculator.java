
public class Calculator {
	void add(int a, int b) {
		int result = a + b;
		
		System.out.printf("%d + %d = %d\n", a, b, result);
	}
	
	void add(double a, int b) {
		double result = a + b;
		
		System.out.printf("%f + %d = %f\n", a, b, result);
	}
	void add(int a, double b) {
		double result = a + b;
		
		System.out.printf("%d + %f = %f\n", a, b, result);
	}
	void add(double a, double b) {
		double result = a + b;
		
		System.out.printf("%f + %f = %f\n", a, b, result);
	}
}
