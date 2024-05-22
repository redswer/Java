import java.util.Scanner;

public class Exam_06 {
	static void decimal(int n) {
		int cnt = 0;
		
		for (int i = 2; i <= n; i++) {
			boolean bool= true;
			
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					bool = false;
					break;
				}
			}
			if (bool) {
				System.out.printf("%3d", i);
				cnt++;
			}
			
		}
		System.out.println("\t소수의 갯수 : " + cnt);
	}
	
	static void binary(int n) {
		int mok = n;
		int na = 0;
		String str = "";
		
		while(mok != 0) {
			na = mok % 2;
			str = na + str;
			mok = mok / 2;
		}
		
		System.out.println("10진수 " + n + " = 2진수 " + str);
	}
	
	static String binaryStr(int n) {
		int mok = n;
		int na = 0;
		String str = "";
		
		while(mok != 0) {
			na = mok % 2;
			str = na + str;
			mok = mok / 2;
		}
		
		return str;
	}
	
	static int[] binaryArr(int n) {
		int mok = n;
		int na = 0;
		int[] res = new int[10];
		int cnt = 0;
		
		while(mok != 0) {
			na = mok % 2;
			res[cnt] = na;
			mok = mok / 2;
			cnt++;
		}
		return res;
	}
	
	static void inputMaxMin() {
		Scanner sc = new Scanner(System.in);
		int[] data = new int[10];
		int cnt = 0;
		
		System.out.print("입력 : ");
		for (int i = 0; i < 10; i++) {
			data[i] = sc.nextInt();
			
			if (data[i] == 0) {
				break;
			}
			
			cnt++;
		}
		
		int max = data[0];
		int min = data[0];
		int sum = 0;
		
		System.out.println();
		System.out.print("입력자료 : ");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%3d", data[i]);
			sum += data[i];
			
			if (data[i] > max) {
				max = data[i];
			} else if (data[i] < min) {
				min = data[i];
			}
		}
		
		System.out.println();
		System.out.printf("최대 : %d, 최소 : %d, 전체합 : %d", max, min, sum);
	}
	
	static void dataRank(int[] a) {
		int[] r = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			r[i] = 1;
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					r[i]++;
				}				
			}
		}
		
		System.out.println("점수\t순위");
		for (int k = 0; k < a.length; k++) {
			System.out.printf("%d\t%d\n", a[k], r[k]);
		}
		
	}

	public static void main(String[] args) {
		// 1. decimal() :  2 ~ n 까지의 소수를 출력하고, 소수 갯수 출력
		decimal(5);
		
		// 2. binary() : 2진수 변환
		binary(37);
		
		// 2-1. binaryStr() : 2진수 변환 반환
		String bin = binaryStr(37);
		System.out.println(bin);
		
		// 2-2. binaryArr() : 2진수 변환 반환
		int[] binArr = binaryArr(37);
		for (int i = binArr.length - 1; i >= 0; i--) {
			System.out.print(binArr[i]);
		}
		System.out.println();
		
		// 3. inputMaxMin() : 키보드로 10개 이내의 데이터를 입력받아 최대, 최소를 구하여 출력(0 이면 종료)
		inputMaxMin();
		System.out.println();
		
		// 4. dataRank() : a 배열에 {5, 4, 7, 2, 9, 5, 3, 7} 이 저장되어 있을 경우 각 데이터에 해당하는 순위를 구하여 출력
		int[] a = {5, 4, 7, 2, 9, 5, 3, 7};
		
		dataRank(a);
	}

}
