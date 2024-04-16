import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호 이름 : ");
		int bun = sc.nextInt();
		String name = sc.next();
		
		System.out.print("국어 영어 수학 : ");
		int kr = sc.nextInt();
		int en = sc.nextInt();
		int math = sc.nextInt();
		
		int sum = kr + en + math;
		double avg = sum / 3.0;
		
		System.out.println("\n번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.print(bun);
		System.out.print("\t");
		System.out.print(name);
		System.out.print("\t");
		System.out.print(kr);
		System.out.print("\t");
		System.out.print(en);
		System.out.print("\t");
		System.out.print(math);
		System.out.print("\t");
		System.out.print(sum);
		System.out.print("\t");
		System.out.print(avg);
		System.out.print("\t");
	}

}
