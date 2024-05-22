import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		// 점수 최대 10개 입력, 오름차순 정렬 후 출력
		// 입력자료에 -99가 있을 경우 종료
		int score[] = new int[10];
		Scanner sc = new Scanner(System.in);
		int cnt;
		
		for (cnt = 0; cnt < 10 ; cnt++) {
			System.out.print("자료입력 : ");
			score[cnt] = sc.nextInt();
			
			if (score[cnt] == -99) {
				break;
			}
		}
		System.out.println();
		
		// 입력자료 출력
		System.out.print("입력자료 : ");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%3d", score[i]);
		}
		System.out.println();
		
		// 오름차순 정렬
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (score[i] > score[j]) {
					int tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
				}
			}
		}
		
		// 출력
		System.out.print("입력자료 : ");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%3d", score[i]);
		}
		System.out.println();
	}

}
