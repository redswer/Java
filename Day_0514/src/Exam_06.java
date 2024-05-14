import java.util.Scanner;

public class Exam_06 {

	public static void main(String[] args) {
		// 2진 검색
		
		int var[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("찾는 값 : ");
		int a = sc.nextInt();
		
		int low = 0;
		int high = var.length - 1;
		int mid;
		
		while(true) {
			if (low > high) {
				System.out.println("자료없음");
				break;
			}
			
			
			mid = (low + high) / 2;
		
			if (a == var[mid]) {
		
				System.out.println(a  + "는 " + (mid + 1) + "번째");
				break;
			} else if (a > var[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
	}

}
