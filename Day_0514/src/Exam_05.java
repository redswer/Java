import java.util.Scanner;

public class Exam_05 {

	public static void main(String[] args) {
		/* 키보드로 번호, 이름, 점수를 입력받아 순위(석차)를 구하여 번호순으로 출력
		 * 학생 수는 최대 10명으로 제한, 입력자료에 0이 입력되거나 10이 초과되면 출력 후 종료
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int bun[] = new int[10];
		String name[] = new String[10];
		int score[] = new int[10];
		int rank[] = new int[10];
		int cnt = 0;
		
		for (int i = 0; i < bun.length; i++) {
			System.out.print("입력 : ");
			bun[i] = sc.nextInt();
			if (bun[i] == 0) {
				break;
			}
			name[i] = sc.next();
			score[i] = sc.nextInt();
			
			cnt++;
		}
		
		for (int i = 0; i < cnt; i++) {
			rank[i] = 1;
			
			for (int j = 0; j < cnt; j++) {
				if (score[i] < score[j]) {
					rank[i]++;
				}
			}
		}
		
		// 기본 출력
		System.out.println("번호\t이름\t점수\t순위");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%d\t%s\t%d\t%d\n", bun[i], name[i], score[i], rank[i]);
		}
		
		System.out.println("----------------------------------------");
		
		// 번호순 출력
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < cnt; j++) {
				if (bun[i] < bun[j]) {
					int tmp = bun[i];
					bun[i] = bun[j];
					bun[j] = tmp;
					
					String tmp2 = name[i];
					name[i] = name[j];
					name[j] = tmp2;
					
					int tmp3 = score[i];
					score[i] = score[j];
					score[j] = tmp3;
					
					int tmp4 = rank[i];
					rank[i] = rank[j];
					rank[j] = tmp4;
				}
			}
		}
		System.out.println("번호\t이름\t점수\t순위");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%d\t%s\t%d\t%d\n", bun[i], name[i], score[i], rank[i]);
		}
	}

}
