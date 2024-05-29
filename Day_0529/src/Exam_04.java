import java.util.Scanner;

class Sawon {
	int bun;
	String name;
	String gender;
	int age;
	
	Sawon() {
	}
	
	Sawon(int bun, String name, String gender, int age) {
		this.bun = bun;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	void print() {
		String g = "여자";
		
		if (gender.equals("m") || gender.equals("M")) {
			g = "남자";
		}
		
		System.out.printf("%d\t%s\t%s\t%d\n", bun, name, g, age);
	}
}

class Sort {
	void sort(Sawon[] s, int cnt) {
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (s[i].bun > s[j].bun) {
					Sawon tmp = s[i];
					s[i] = s[j];
					s[j] = tmp;
				}
			}
		}
	}
}

public class Exam_04 {

	public static void main(String[] args) {
		// 사원 최대 10명, 번호가 0이면 출력 후 종료
		
		Scanner sc = new Scanner(System.in);
		Sawon s[] = new Sawon[10];
		
		int cnt = 0;
		
		while(cnt < 10) {
			System.out.print("사원등록 : ");
			int bun = sc.nextInt();
			
			if (bun == 0) {
				break;
			}
			
			String name = sc.next();
			String gender = sc.next();
			int age = sc.nextInt();
			
			s[cnt] = new Sawon(bun, name, gender, age);
			
			cnt++;
		}
		
		System.out.println("번호\t이름\t성별\t나이");
		for (int i = 0; i < cnt; i++) {
			s[i].print();
		}
		
		Sort sort = new Sort();
		sort.sort(s, cnt);
		
		System.out.println("번호\t이름\t성별\t나이");
		for (int i = 0; i < cnt; i++) {
			s[i].print();
		}
	}

}