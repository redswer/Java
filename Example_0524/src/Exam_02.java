import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		int[] data = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < data.length; i++) {
			System.out.print("data " + (i + 1) + " : ");
			data[i] = sc.nextInt();
		}
		
		int sum = 0;
		double avg = 0;
		int max = data[0];
		int min = data[0];
		
		System.out.printf("Input Data : ");
		for (int i = 0; i < data.length; i++) {
			System.out.printf("%d ", data[i]);
			sum += data[i];
			
			if (data[i] > max) {
				max = data[i];
			} else if (data[i] < min) {
				min = data[i];
			}
		}
		
		avg = (double) sum / data.length;
		
		System.out.println();
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %f\n", avg);
		System.out.printf("최대값 : %d\n", max);
		System.out.printf("최소값 : %d", min);
	}
}
