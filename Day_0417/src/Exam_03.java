
public class Exam_03 {

	public static void main(String[] args) {
		// !, ~ (논리부정)
		// ~ => +1 한 후 음수로 변환 => ex) ~7 == -8
		
		boolean flag = true;
		
		System.out.println(flag);
		System.out.println(!flag);
		
		int a = 7;
		int b = ~a;
		
		System.out.printf("a = %d, b = %d", a, b);
	}

}
