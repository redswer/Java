
public class Exam_11 {

	public static void main(String[] args) {
		// 무한 반복문 for(;;) / while(true)
		// 1 ~ 100 까지의 홀수 출력
		int i = 0;
		
		for(;;) {
			i++;
			if (i % 2 == 1) {
				System.out.println(i);
			}
			if (i == 100) {
				break;
			}
		}
		
		System.out.println("--------------------------------");
		
		i = 0;
		while (true) {
			i++;
			if (i % 2 == 1) {
				System.out.println(i);
			}
			if (i == 100) {
				break;
			}
		}
	}

}
