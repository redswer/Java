import java.util.Scanner;

public class Exam_09 {

	public static void main(String[] args) {
		/* 키보드로 점수를 입력받아 배열에 저장 후 출력
		 * 1 ~ 100 사이의 점수만 배열에 저장
		 * 점수는 10개까지만 입력 가능
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int score[] = new int[10];
		
		System.out.print("점수입력 : ");
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			
			if (score[i] > 100 || score[i] < 1) {
				i--;
				continue;
			}
		}
		
		int sum = 0;
		
		System.out.print("Data : ");
		for(int i : score) {
			System.out.printf("%d ", i);
			sum += i;
		}
		
		double avg = sum / 10.0 ;
		
		System.out.println();
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
