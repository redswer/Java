
public class Exam_10 {

	public static void main(String[] args) {
/*		1
		2   3
		4   5   6
		7   8   9   10
		11  12  13  14   15
								*/
		
		System.out.printf("%d\t\n", 1);
		System.out.printf("%d\t", 2);
		System.out.printf("%d\t\n", 3);
		System.out.printf("%d\t", 4);
		System.out.printf("%d\t", 5);
		System.out.printf("%d\t\n", 6);
		System.out.printf("%d\t", 7);
		System.out.printf("%d\t", 8);
		System.out.printf("%d\t", 9);
		System.out.printf("%d\t\n", 10);
		System.out.printf("%d\t", 11);
		System.out.printf("%d\t", 12);
		System.out.printf("%d\t", 13);
		System.out.printf("%d\t", 14);
		System.out.printf("%d\t\n", 15);
		
		System.out.println("-----------------------------------------");
		
		int n = 1;
		
		for (int i = 1 ; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i >= j) {
					System.out.printf("%d\t", n);
					n++;
				}
			}
			System.out.println();
		}
	}

}
