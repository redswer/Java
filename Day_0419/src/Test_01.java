import java.util.Scanner;

public class Test_01 {

	public static void main(String[] args) {
		// 키보드로 정수를 입력받아 홀수 짝수를 구분
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		String s = n % 2 == 0 ? "짝수" : "홀수";
		
		System.out.printf("%d 는(은) %s입니다.", n, s);
	}

}
