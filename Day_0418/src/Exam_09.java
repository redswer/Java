import java.util.Scanner;

public class Exam_09 {

	public static void main(String[] args) {
		// 키보드로 점수를 입력
		// 입력된 점수가 90 이상이면 'A', 80 이상이면 'B', 그 외는 'C' 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수입력 : ");
		int n = Integer.parseInt(sc.nextLine());
		
		char rank = n >= 90 ? 'A' : n >= 80 ? 'B' : 'C';
		
		System.out.println(rank);
	}

}
