import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("10진수 : ");
			int dec = sc.nextInt();
			
			if (dec == -99)
				break;
			
			String bin = "";
			int tmp = dec;
			
			while (tmp != 0) {
				int mok = tmp / 2;
				int na = tmp % 2;
				bin = na + bin;
				
				tmp = mok;
			}
			
			System.out.println("2진수 : " + bin);
		}
	}

}
