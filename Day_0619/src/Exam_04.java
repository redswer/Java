import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		while(true) {
			System.out.print("10진수 : ");
			int dec = sc.nextInt();
			
			if (dec == -99)
				break;
			
			int tmp = dec;
			
			while (tmp != 0) {
				int mok = tmp / 2;
				int na = tmp % 2;
				sb.insert(0, na);
				tmp = mok;
			}
			
			System.out.println("2진수 : " + sb);
			sb.delete(0, sb.length());
		}
	}

}
