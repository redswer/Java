import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		// 사원이름 등급 근무시간을 입력받아 주간 급여를 계산
		// 주간급여는 근무시간과 시급을 곱한 값으로 함
		// 1등급은 시급 10000 원, 2등급은 5000 원, 3등급은 2000 원으로 함
		// 근무시간이 36시간을 초과한 경우 초과 근무시간에 대해 시급의 1.5배를 지급하며 근무시간은 최대 50시간까지만 인정
		// 사원 이름에 end 가 입력되면 프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("사원정보 : ");
			String name = sc.next();
			int gd = sc.nextInt();
			int ti = sc.nextInt();
			
			if (name.equalsIgnoreCase("end")) {
				break;
			}
			
			int pay = 0;
			int h = 0;
			
			switch (gd) {
			case 1:
				h = 10000;
				break;
			case 2:
				h = 5000;
				break;
			case 3:
				h = 2000;
				break;
			}
			
			if (ti <= 36) {
				pay = h * ti;
			} else if (ti <= 50) {
				pay = h * 36 + (int)(h * 1.5) * (ti - 36);
			} else if (ti > 50) {
				pay = h * 36 + (int)(h * 1.5) * 14;
			}
			
			System.out.println("아이디\t등급\t시급\t근무시간\t주간급여");
			System.out.printf("%s\t%d\t%d\t%d\t%d\n", name, gd, h, ti, pay);
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
