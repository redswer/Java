
public class Exam_06 {

	public static void main(String[] args) {
		// 1  + 2 - 3 + 4 - 5 ....10 = xx
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {			
			if (i % 2 == 1) {
				if (i == 1) {
					sum += i;
				} else {
					sum -= i;
				}
				
				System.out.print(i + " + ");					
			} else if (i != 10) {
				sum += i;
				System.out.print(i + " - ");
			} else {
				sum += i;
				System.out.print(i + " = ");
			}
		}
		
		System.out.print(sum);
	}

}
