import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		// 키보드로 정수 5개 입력받아 배열에 저장 후 출력 (for 문 이용)
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		for (int i = 0; i < arr.length;i++) {
			System.out.printf("정수 %d 입력 : ", i + 1);
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
	}

}
