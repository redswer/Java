import java.util.Scanner;

public class Exam_06 {

	public static void main(String[] args) {
		/* 수치입력(1~?) 6
		 * 
		 * [결과출력]
		 * 1 : ****...(20)
		 * 2 : ****...(17)
		 * 3 : ****...(22)
		 * 4 : ****...(18)
		 * 5 : ****...(13)
		 * 6 : ****...(10)
		 * 
		 * 발생 빈도수가 가장 많은 수 : 3
		 * 발생 빈도수가 가장 적은 수 : 6
		 * 
		 * [처리조건]
		 * 입력된 범위의 수가 랜덤으로 100번 발생
		 * 발생된 개수만큼 * 출력하고 발생회수 출력
		 * 입력값이 0 이면 종료
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("수치 입력 (1 ~ ?) : ");
			int n = sc.nextInt();
			
			if (n == 0) {
				break;
			}
			
			int[] arr = new int[n];
			
			for (int i = 0; i < 100; i++) {
				int s = (int)(Math.random() * n) + 1;
				arr[s - 1]++;
			}
			
			int max = arr[0];
			int max_num = 1;
			int min = arr[0];
			int min_num = 1;
			
			for (int i = 0; i < n; i++) {
				if (arr[i] > max) {
					max = arr[i];
					max_num = i + 1;
				} else if (arr[i] < min) {
					min = arr[i];
					min_num = i + 1;
				}
				
				System.out.printf("%d : ", (i + 1));
				
				for (int j = 0; j < arr[i]; j++) {
					System.out.print("*");
				}
				
				System.out.printf("(%d)\n", arr[i]);
			}
			
			System.out.println("발생 빈도수가 가장 많은 수 : " + max_num);
			System.out.println("발생 빈도수가 가장 적은 수 : " + min_num);
		}
		System.out.println("프로그램 종료");
	}

}
