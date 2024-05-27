import java.util.Scanner;

public class Exam_09 {

	public static void main(String[] args) {
		// 성적처리
		// 키보드로 번호, 이름, 국어, 영어, 수학 입력
		// 번호 이름 국어 영어 수학 총점 평균 순으로 출력
		
		Scanner sc = new Scanner(System.in);
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		st3.school = "xx대학교";
		
		System.out.println("학교\t번호\t이름\t국어\t영어\t수학\t총점\t평균");
		st1.student(1, "김학생", 95, 88, 70);
		st2.student(4, "이학생", 75, 45, 68);
		st3.student(3, "장학생", 78, 98, 88);
	}

}
