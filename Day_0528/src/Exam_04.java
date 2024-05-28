class Account {
	int bun;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
	
	Account() {}
	
	Account(int bun, int kor, int eng, int math) {
		this.bun = bun;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tot = kor + eng + math;
		this.avg = tot / 3.0;
	}
	
	void accPrint() {
		String gr = "";
		
		for (int i = 1; i <= avg / 5; i++) {
			gr += "*";
		}
		
		System.out.printf("%d\t%d\t%.2f\t%s\n", bun, tot, avg, gr);
	}
}

public class Exam_04 {

	public static void main(String[] args) {
		Account a1 = new Account(1, 90, 70, 80);
		Account a2 = new Account(2, 95, 75, 85);
		Account a3 = new Account(3, 79, 77, 78);
		
		System.out.println("번호\t총점\t평균\t그래프");
		a1.accPrint();
		a2.accPrint();
		a3.accPrint();
	}

}
