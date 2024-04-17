
public class Exam_02 {

	public static void main(String[] args) {
		int a = 5, b = 0;
		b = a++;
		
		System.out.printf("a = %d, b = %d\n", a, b);
		
		int a1 = 5, b1 = 0;
		b1 = ++a1;
		
		System.out.printf("a1 = %d, b1 = %d\n", a1, b1);
		
		int a2 = 5, b2 = 0;
		b2 = a2++ + 10;
		
		System.out.printf("a2 = %d, b2 = %d\n", a2, b2);
		
		int a3 = 5, b3 = 0;
		b3 = ++a3 + 10;
		
		System.out.printf("a3 = %d, b3 = %d", a3, b3);
	}

}
