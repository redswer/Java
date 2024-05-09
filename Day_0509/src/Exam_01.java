import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		/* 1. 1차원 배열 10개를 선언하여 Data 를 입력받아 배열에 저장
		 * 	data 1 : xx
		 *	data 2 : xx
		 * 		.
		 * 		.
		 * 	data 10 : xx
		 * 
		 * 2. 배열에 저장된 데이터 출력
		 * 	Input Data : xx xx xx xx ...
		 * 
		 * 3. 합계와 평균 최대값 최소값 출력
		 * 	합계 : 
		 * 	평균 : 
		 * 	최대값 : 
		 * 	최소값 : 
		 * */
		Scanner sc = new Scanner(System.in);
		
		int data[] = new int[10];
		
		for (int i = 0; i < data.length; i++) {
			System.out.printf("data %d : ", i + 1);
			data[i] = sc.nextInt();
		}
		
		int sum = 0;
		int max = data[0];
		int min = data[0];
		
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			} else if (data[i] < min) {
				min = data[i];
			}
			
			sum += data[i];
		}
		
		double avg = sum / 10.0;
		
		System.out.print("Input Data : ");
		for(int i : data) {
			System.out.printf("%d ", i);
		}
		
		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}
