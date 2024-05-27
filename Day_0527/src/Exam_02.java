
public class Exam_02 {

	public static void main(String[] args) {
		// 1 ~ 45 로또번호 출력
		for (int i = 0; i < 6; i++) {
			int r = (int)(Math.random() * 45) + 1;
			System.out.print(r + " ");			
		}
		System.out.println();
		// => 중복된 번호가 가능함
		
		// 중복 삭제
		int lotto[] = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

}
