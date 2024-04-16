
public class Exam_03 {

	public static void main(String[] args) {
		int bun = 1101;
		String name = "김학생";
		int kr = 95;
		int en = 88;
		int math = 91;
		
		int sum = kr + en + math;
		double avg = sum / 3.0;

		System.out.println("번호\t이름\t총점\t평균");
		System.out.println(bun + "\t" + name + "\t" + sum + "\t" + avg);
		
		System.out.println("-------------------------------------");
		
		System.out.println("번호\t이름\t총점\t평균");
		System.out.print(bun + "\t");
		System.out.print(name + "\t");
		System.out.print(sum + "\t");
		System.out.print(avg + "\t");
	}
}