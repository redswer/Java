
public class Exam_03 {

	public static void main(String[] args) {
		Sawon s1 = new Sawon();
		s1.sabun = 1111;
		s1.name = "오사원";
		s1.age = 50;
		s1.gender = true;
		
		Sawon s2 = new Sawon(1101, "이사원", 30, true);
		Sawon s3 = new Sawon(1102, "김사원", 23, false);
		Sawon s4 = new Sawon(1103, "이사원", 35, false);
		Sawon s5 = new Sawon(1104, "이사원", 40, true);
		
		System.out.println("사번\t이름\t나이\t성별");
		s1.sawonPrint();
		s2.sawonPrint();
		s3.sawonPrint();
		s4.sawonPrint();
		s5.sawonPrint();
	}

}
