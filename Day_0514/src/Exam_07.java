import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) {
		/* ave 배열에 {78, 90, 88, 56, 79, 87, 73, 95, 66, 93, 85, 77}
		 * 데이터가 저장되어 있을 경우 키보드로 점수를 입력받아서 검색하는 프로그램 작성
		 * */
		
		int ave[] = {78, 90, 88, 56, 79, 87, 73, 95, 66, 93, 85, 77};
		int bun[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < ave.length; i++) {
			for (int j = 0; j < ave.length; j++) {
				if (ave[i] < ave[j]) {
					int tmp = ave[i];
					ave[i] = ave[j];
					ave[j] = tmp;
					
					int tmp2 = bun[i];
					bun[i] = bun[j];
					bun[j] = tmp2;
				}
			}
		}
		
		while (true) {
			System.out.print("점수 : ");
			int score = sc.nextInt();
			
			if (score == -99) {
				break;
			}
			
			int low = 0;
			int high = ave.length - 1;
			int mid;
			
			while (true) {
				if (low > high) {
					System.out.println(score + "점은 없음");
					break;
				}
				
				mid = (low + high) / 2;
				
				if (score == ave[mid]) {
					System.out.println(score + "점은 " + bun[mid] + "번째 있음");
					break;
				} else if (score > ave[mid]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
