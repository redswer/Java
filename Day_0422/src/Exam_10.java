
public class Exam_10 {

	public static void main(String[] args) {
		// 대, 중, 소
		
		int a = 7, b = 9, c = 6;
		
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
		
		System.out.println("대 : " + a);
		System.out.println("중 : " + b);
		System.out.println("소 : " + c);
	}

}
