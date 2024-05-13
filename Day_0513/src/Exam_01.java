import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		/* 1. 1차원 배열 최대 100개 저장할 수 있는 score 배열
		 * 2. 키보드로 입력받아 배열에 저장
		 * 	  단, 입력자료가 100개이거나 입력자료가 -99면 입력종료
		 * 3. 출력[1] 한 줄에 10개씩 전체 룰력
		 * 4. 출력[2] 평균 이상인 자료만 출력
		 * 5. 출력[3] 평균에 가장 가까운 값 출력
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int score[] = new int[100];
		int cnt = 0;
		int sum = 0;
		double avg = 0;
		
		// 입력
		for (int i = 0; i < score.length; i++) {
			System.out.print("데이터 입력 : ");
			score[i] = sc.nextInt();
			
			if (score[i] == -99) {
				break;
			}
			
			cnt++;
			sum+= score[i];
		}
		
		// 출력[1]
		System.out.print("데이터 출력 : ");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%d ", score[i]);
			
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
		
		// 츨략[2]
		avg = sum / cnt;
		
		System.out.println();
		System.out.printf("평균(%.2f)이상 : ", avg);
		for (int i = 0; i < cnt; i++) {
			if (score[i] >= avg) {				
				System.out.printf("%d ", score[i]);
			}
		}
		
		// 출력[3]
		double c = 100;
		int s = score[0];
		
		for(int i = 0; i < cnt; i++) {
			if (avg == score[i]) {
				s = score[i];
			} else if ((avg - score[i]) > 0) {
				if (c > (avg - score[i])) {
					c = avg - score[i];
					s = score[i];
				}
			} else if((avg - score[i]) < 0) {
				if(c > (score[i] - avg)) {
					c = score[i] - avg;
					s = score[i];
				}
			}
		}	
		System.out.println();
		System.out.printf("평균(%.2f)에 가장 가까운 값 : %d", avg, s);
	}
}
