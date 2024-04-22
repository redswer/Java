
public class Exam_09 {

	public static void main(String[] args) {
		// 3개의 정수 중 최소값
		
		int a = 7, b = 8, c = 5;
		
		int min = a;
		
		if (a > b) {
			min = b;
		}
		
		if (min > c) {
			min = c;
		}
		
		System.out.println("max : " + min);
	}

}
