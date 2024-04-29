/*  구구단 전체 출력
 *  [2 단]      [3 단]     .   .   [9 단]
 *  2 * 1 = 2   3 * 1 =  3        9 * 1 = 9
 *  
 *  
 *  2 * 9 = 18  3 * 9 = 27        9 * 9 = 81
 */
public class Exam_12 {
	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			System.out.printf("   [%d 단]\t",i);
		}
		System.out.println();
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %2d\t", j, i, (j * i));
			}
			System.out.print("\n");
		}
	}

}
