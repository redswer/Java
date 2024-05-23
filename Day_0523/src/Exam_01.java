
public class Exam_01 {
	static void sum(int[] score) {
		int sum = 0;
		
		System.out.print("Data : ");
		for (int i = 0; i < score.length; i++) {
			if (i == score.length - 1) {
				System.out.printf("%d = ", score[i]);
			} else {
				System.out.printf("%d + ", score[i]);				
			}
			sum += score[i];
		}
		
		System.out.print(sum);
	}
	
	static void print(int[] score) {
		System.out.print("Data : ");
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%3d", score[i]);
		}
		
		System.out.println();
	}
	
	static void avg(int[] score) {
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		double avg = (double) sum / score.length;
		
		print(score);
		System.out.printf("평균(%.2f)이상 : ", avg);
		for (int i = 0; i < score.length; i++) {
			if (score[i] >= avg) {
				System.out.printf("%3d", score[i]);
			}
		}
	}
	
	static void sortS(int[] score) {
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] > score[j]) {
					int tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
				}
			}
		}
		
		print(score);
		System.out.print("Sort : ");
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%3d", score[i]);
		}
	}
	
	static void sortB(int[] score) {		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length - i - 1; j++) {
				if (score[j] < score[j + 1]) {
					int tmp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = tmp;
				}
			}
		}
		
		print(score);
		System.out.print("Sort : ");
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%3d", score[i]);
		}
	}
	
	static int max(int[] score) {
		int max = score[0];
		
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
		}
		
		return max;
	}
	
	static int min(int[] score) {
		int min = score[0];
		
		for (int i = 0; i < score.length; i++) {
			if (score[i] < min) {
				min = score[i];
			}
		}
		
		return min;
	}

	public static void main(String[] args) {
		int score[] = {30, 67, 55, 79, 97, 65, 33, 78, 96, 58, 94, 32};
		
		// 1. 전체 합계를 출력하는 메서드 작성
		// Data : 30 + 67 + 55 + ... + 32 = xx
		sum(score);
		System.out.println("\n--------------------------------------");
		
		// 2. 평균 이상 점수를 구하여 출력하는 메서드 작성
		// Data : 30 60 55 79 97 65 33 78 96 58 94 32
		// 평균(xx)이상 : xx xx xx xx
		avg(score);
		System.out.println("\n--------------------------------------");
		
		// 3. 선택정렬 이용한 오름차순 정렬 메서드
		// Data : ...
		// Sort : 30 32 33 55 58 .... 97
		sortS(score);
		System.out.println("\n--------------------------------------");
		
		// 4. 버블정렬 이용한 내림차순 정렬 메서드
		sortB(score);
		System.out.println("\n--------------------------------------");
		
		// 5. 배열 요소 중 최대값을 찾아서 반환하는 메서드
		print(score);
		System.out.println("최대값 : " + max(score));
		System.out.println("--------------------------------------");
		
		// 6. 최소값
		print(score);
		System.out.println("최소값 : " + min(score));
		
	}

}
