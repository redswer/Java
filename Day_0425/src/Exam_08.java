import java.util.Scanner;

public class Exam_08 {

	public static void main(String[] args) {
		// 키보드로 점수 (1 ~ 100 사이) 7개를 입력받아 최소값, 최대값을 뺀 나머지 합계, 평균을  구하여 출력
		// 단, 입력점수가 범위를 벗어나면 "입력오류" 를 출력 후 재입력
		// 평균이 100 ~ 87 이면 "A", 86 ~ 73 이면 "B", 72 ~ 55 면 "C", 나머지는 "D" 출력
		// while 문 이용
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int max = 0;
		int min = 101;
		int cnt = 0;
		
		while (cnt != 7) {
			System.out.print("입력 점수 : ");
			int n = sc.nextInt();
			
			cnt++;
			
			if (n < 1 || n > 100) {
				System.out.println("입력오류");
				cnt--;
				continue;
			}
			
			sum += n;
			
			if (n > max) {
				max = n;
			}
			if (n < min) {
				min = n;
			}
		}
		
		sum = sum - min - max;
		double avg = sum / 5.0;
		String grade = "D";
		
		if (avg >= 87) {
			grade = "A";
		} else if (avg >= 73) {
			grade = "B";
		} else if (avg >= 55) {
			grade = "C";
		}
		
		System.out.println("최대점수 : " + max);
		System.out.println("최소점수 : " + min);
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f(%s)", avg, grade);
	}

}
