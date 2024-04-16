import java.util.Scanner;

public class Exam_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호 : ");
		String bun = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("국어 : ");
		int kr = Integer.parseInt(sc.nextLine());
		System.out.print("영어 : ");
		int en = Integer.parseInt(sc.nextLine());
		System.out.print("수학 : ");
		int math = Integer.parseInt(sc.nextLine());
		
		int sum = kr + en + math;
		double avg = sum / 3.0;
		
		System.out.println("\n번호\t이름\t총점\t평균");
		System.out.print(bun + "\t");
		System.out.print(name + "\t");
		System.out.print(sum + "\t");
		System.out.print(avg + "\t");
	}

}
