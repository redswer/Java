
public class Exam_08 {

	public static void main(String[] args) {
		// 3개의 정수 중 최대값
		
		int a = 7, b = 8, c = 5;
		
		int max = a;
		
		if (a < b) {
			max = b;
		}
		
		if (max < c) {
			max = c;
		}
		
		System.out.println("max : " + max);
	}

}
