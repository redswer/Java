import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		/* 1. 1차원 배열 100개를 선언하여 키보드로 점수를 입력받아 배열에 저장
		 * 	단, 입력자료는 최대 100개를 넘지 않으며, 입력값에 -99가 있을 경우 종료
		 * 
		 * 2. 배열에 저장된 데이터를 출력
		 *  단, 입력자료의 수가 10 이상일 경우 한 라인에 10개씩 출력
		 *  
		 * 3. 합계, 평균, 최대값, 최소값 출력
		 * 
		 * 4. for 문 사용
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int score[] = new int[100];
		int cnt = 0;
		
		for (int i = 0; i < score.length; i++) {
			System.out.printf("data %d : ", i + 1);
			score[i] = sc.nextInt();
			
			if (score[i] == -99) {
				break;
			}
			cnt++;
		}
		
		int max = score[0];
		int min = score[0];
		int sum = 0;
		double avg = 0;
		
		System.out.print("Input Data : ");
		for(int i = 0; i < cnt; i++) {
			System.out.printf("%d ", score[i]);
			if (i > 0 && (i + 1) % 10 == 0) {
				System.out.println();
			}
			
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
			sum += score[i];
		}
		
		avg = (int)(sum / (double) cnt * 100 + 0.5) / 100.0;
		
		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}
