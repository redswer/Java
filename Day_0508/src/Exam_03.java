import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		String str[] = new String[10];
		
		System.out.print("10진수 : ");
		int dec = sc.nextInt();
		
		System.out.print("변환진수 : ");
		int con = sc.nextInt();
		
		int na = 0;
		int cnt = 0;
		
		while(dec != 0) {
			na = dec % con;
			dec = dec / con;
			str[cnt] = ch[na] + "";
			cnt++;
		}
		
		for(int i = cnt - 1; i >= 0; i--) {
			System.out.print(str[i]);
		}
	}

}
