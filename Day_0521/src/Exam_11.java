import java.util.Scanner;

public class Exam_11 {
	static String binConStr(int a) {
		String str = "";
		int na = 0;
		
		while(a != 0) {
			na = a % 2;
			str = na + str;
			a = a / 2;
		}
		return str;
	}
	
	static int[] binConArr(int a) {
		int str[] = new int[10];
		int cnt = 0;
		int na = 0;
		
		while (a != 0) {
			na = a % 2;
			str[cnt] = na;
			a = a / 2;
			cnt++;
		}
		return str;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("10진수 입력 : ");
		int dec = sc.nextInt();
		
		String bin = binConStr(dec);
		System.out.printf("10진수 %d 는 2진수 %s\n", dec, bin);
		
		int binArr[] = binConArr(dec); // 2진수는 최대 10자리 까지
		System.out.printf("10진수 " + dec + " 2진수 ");
		for (int i = binArr.length - 1; i >= 0; i--) {
			System.out.print(binArr[i] + " ");
		}
	}

}
