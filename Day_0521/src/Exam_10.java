
public class Exam_10 {
	// 가변인자
	
//	static void scoreMax(int a, int b) {
//		
//	}
//	static void scoreMax(int a, int b, int c) {
//		
//	}
//	static void scoreMax(int a, int b, int c, int d) {
//		
//	}
//	static void scoreMax(int a, int b, int c, int d, int e) {
//		
//	}
	
	// =>
	static int scoreMax(int ... a) { // => 배열로 동작함
		int max = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int max = scoreMax(1, 2, 3, 4, 5);
		System.out.println(max);
		
		int a[] = {1, 2, 3, 4, 5};
		System.out.println(scoreMax(a));
		
		System.out.println(scoreMax(new int[] {1, 2, 3, 4, 5}));
	}

}
