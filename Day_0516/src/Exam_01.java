
public class Exam_01 {

	public static void main(String[] args) {
		// 2차원 배열 (행*열)
		
		int a[][];
		a = new int[2][3]; // 2줄 3칸
		
		System.out.println(a.length); // 줄 수
		System.out.println(a[0].length); // 0번째 줄의 칸 수
		System.out.println(a[1].length); // 1번째 줄의 칸 수
		System.out.println(a[0][0]); // 0번째 줄 0번째 칸의 값
		
		System.out.println("---------------------------");
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("---------------------------");
		
		for(int i[] : a) {
			for(int j : i) {
				System.out.printf("%3d", j);
			}
			System.out.println();
		}
	}

}
