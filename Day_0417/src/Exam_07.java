
public class Exam_07 {

	public static void main(String[] args) {
		int a = 35;
		
		System.out.printf("String = %s\n", a + 1);
		System.out.printf("String = %s\n", a + "1");
		
		String s = a + "";
		
		System.out.printf("s = %s\n", (3 + 4 + s));
		System.out.printf("s = %s", (3 + (4 + s)));
	}

}
