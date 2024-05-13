
public class Exam_07 {

	public static void main(String[] args) {
		int bun[] = {1, 2, 3, 4, 5};
		int score[] = {80, 90, 85, 79, 60};
		
		/* 번호 오름차순, 점수 내림차순으로 정렬해서 각각 출력
		 * 번호	점수		번호	점수
		 * 1	80		2	90
		 * 2	90		3	85
		 * 	 .			  .
		 *   .			  .
		 * */
		
		System.out.printf("번호\t점수");
		for (int i = 0; i < score.length; i++) {
			System.out.printf("\n%d\t%d", bun[i], score[i]);
		}
		
		System.out.println("\n-----------------------------");
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length - i - 1; j++) {
				if (score[j] < score[j + 1]) {
					int tmp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = tmp;
					
					int tmp2 = bun[j];
					bun[j] = bun[j + 1];
					bun[j + 1] = tmp2;
				}
			}
		}
		System.out.printf("번호\t점수");
		for (int i = 0; i < score.length; i++) {
			System.out.printf("\n%d\t%d", bun[i], score[i]);
		}
	}

}
