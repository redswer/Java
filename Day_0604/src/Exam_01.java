class AA {
	int bun;
	String name;
	int age;
	
	 AA() {
	 }
	
	 AA(int bun, String name, int age) {
		 this.bun = bun;
		 this.name = name;
		 this.age = age;
	 }
	 
	 void aaPrint() {
		 System.out.print(bun + "\t" + name + "\t" + age);
	 }
}
public class Exam_01 {

	public static void main(String[] args) {	
		AA a = new AA();
		a.bun = 3;
		a.name = "김학생";
		a.age = 30;
		
		AA a1 = new AA(1, "이학생", 23);
		
		a.aaPrint();
		System.out.println();
		a1.aaPrint();
		
		AA[] aa = new AA[10];
		aa[0] = a;
		aa[1] = a1;
		aa[2] = new AA(2, "김학생", 28);
		
		a1 = new AA(6, "최학생", 29);
		aa[3] = a1;
		
		System.out.println();
		System.out.println("번호\t이름\t나이");
		for (int i = 0; i < 4; i++) {
			aa[i].aaPrint();
			System.out.println();
		}
		
	}

}
