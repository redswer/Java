import java.util.Scanner;

public class Exam_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score[] = new int[10];
		int cnt = 0;
		int sum = 0;
		double avg = 0;
		
		System.out.print("점수입력 : ");
		while(cnt < 10) {
			score[cnt] = sc.nextInt();
			
			if (score[cnt] < 1 || score[cnt] > 100) {
				continue;
			}
			
			cnt++;
		}
		
		System.out.print("Data : ");
		for(int i : score) {
			sum += i;
			System.out.printf("%d ", i);
		}
		
		avg = sum / 10.0 ;
		
		System.out.println();
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
