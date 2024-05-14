
public class Exam_04 {

	public static void main(String[] args) {
		int bun[] = {7, 3, 5, 6, 2, 1};
		int score[] = {70, 85, 90, 88, 85, 79};
		int rank[] = new int[6];
		
		// 1. 배열 순서 변경 없이 번호, 점수, 순위 출력
		// 2. 순위 오름차순으로 출력
		
		// 1.
		for (int i = 0; i < rank.length; i++) {
			rank[i] = 1;
			
			for (int j = 0; j < rank.length; j++) {
				if (score[i] < score[j]) {
					rank[i]++;
				}
			}
		}
		
		System.out.printf("%s%4s%4s\n", "번호", "점수", "순위");
		for (int i = 0; i < bun.length; i++) {
			System.out.printf("%2d%5d%4d\n", bun[i], score[i], rank[i]);
		}
		
		System.out.println("-----------------------------------------");
		
		// 2.
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (rank[i] < rank[j]) {
					int tmp = rank[i];
					rank[i] = rank[j];
					rank[j] = tmp;
					
					int tmp2 = bun[i];
					bun[i] = bun[j];
					bun[j] = tmp2;
					
					int tmp3 = score[i];
					score[i] = score[j];
					score[j] = tmp3;
				}
			}
		}
		
		System.out.printf("%s%4s%4s\n", "번호", "점수", "순위");
		for (int i = 0; i < bun.length; i++) {
			System.out.printf("%2d%5d%4d\n", bun[i], score[i], rank[i]);
		}
	}

}
