import java.util.Scanner;

public class Exam_02 {
	static void find_i(int n) {
		int cnt = 0;
		
		for (int i = 2; i <= n; i++) {
			boolean bool = true;
			
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					bool = false;
					break;
				}
			}
			
			if (bool) {
				System.out.printf("%d ", i);
				cnt++;
				
				if (cnt % 7 == 0) {
					System.out.println();
				}
			}
		}
		
		System.out.println();
		System.out.println("소수는 총 " + cnt + "입니다.");
	}
	
	static void change_2(int n) {
		String str = "";
		int mok = n;
		int na = 0;
		while(n != 0) {
			na = n % 2;
			str = na + str;
			n = n / 2;
		}
		System.out.printf("10진수 %d는 2진수 %s 입니다\n", mok, str);
	}
	static void change_8(int n) {
		String str = "";
		int mok = n;
		int na = 0;
		while(n != 0) {
			na = n % 8;
			str = na + str;
			n = n / 8;
		}
		System.out.printf("10진수 %d는 8진수 %s 입니다\n", mok, str);
	}
	static void change_16(int n) {
		String str = "";
		int mok = n;
		int na = 0;
		while(n != 0) {
			na = n % 16;
			
			switch (na) {
			case 10:
				str = 'A' + str;
				break;
			case 11:
				str = 'B' + str;
				break;
			case 12:
				str = 'C' + str;
				break;
			case 13:
				str = 'D' + str;
				break;
			case 14:
				str = 'E' + str;
				break;
			case 15:
				str = 'F' + str;
				break;
			default:
				str = na + str;
				break;
			}
			
			n = n / 16;
		}
		System.out.printf("10진수 %d는 16진수 %s 입니다\n", mok, str);
	}
	
	static void m2(int n, int ch) {
		if (ch == 2) {
			change_2(n);
		} else if (ch == 8) {
			change_8(n);
		} else if (ch == 16) {
			change_16(n);
		} else if (ch == 0) {
			change_2(n);
			change_8(n);
			change_16(n);
		}
	}
	
	static void sort(int n, int[][] score) {
		int [][] copy = new int[7][4];
		
		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < copy[i].length; j++) {
				copy[i][j] = score[i][j];
			}
		}
		
		if (n == 1) {
			for (int i = 0; i < copy.length - 1; i++) {
				for (int j = i + 1; j < copy.length; j++) {
					if (copy[i][0] > copy[j][0]) {
						int[] tmp = copy[i];
						copy[i] = copy[j];
						copy[j] = tmp;
					}
				}
			}
		} else if (n == 2) {
			for (int i = 0; i < copy.length - 1; i++) {
				for (int j = i + 1; j < copy.length; j++) {
					if (copy[i][0] < copy[j][0]) {
						int[] tmp = copy[i];
						copy[i] = copy[j];
						copy[j] = tmp;
					}
				}
			}
		}
		
		System.out.println("학번\t국어\t영어\t수학");
		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < copy[i].length; j++) {
				System.out.printf("%d\t", copy[i][j]);
			}
			System.out.println();
		}
	}
	
	static void search(int n, int[][] score) {
		int low = 0;
		int high = score.length - 1;
		int mid;
		
		while(true) {
			if (low > high) {
				System.out.println("등록된 학생이 없습니다.");
				break;
			}
			
			
			mid = (low + high) / 2;
		
			if (n == score[mid][0]) {
				int sum = 0;
				double avg = 0;
				
				System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
				for (int i = 0; i < score[i].length; i++) {
					System.out.printf("%d\t", score[mid][i]);
					sum += score[mid][i];
				}
				sum = sum - score[mid][0];
				avg = sum / 3.0;
				
				System.out.printf("%d\t%f\n", sum, avg);
				break;
			} else if (n > score[mid][0]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] score = {{1101, 90, 70, 85},
						{1105, 88, 80, 88},
						{1108, 79, 90, 79},
						{1102, 90, 75, 95},
						{1104, 80, 65, 70},
						{1107, 88, 88, 60},
						{1103, 95, 85, 85}};
		
		while(true) {
			System.out.println("[1] 소수 구하기");
			System.out.println("[2] 진법 변환하기");
			System.out.println("[3] 배열정렬");
			System.out.println("[4] 2진검색");
			System.out.println("[5] 프로그램종료");
			System.out.println("메뉴 선택(1 ~ 5) : ");
			
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.print("2 ~ n 까지의 소수 : ");
				int n = sc.nextInt();
				find_i(n);
				System.out.println();
			} else if (menu == 2) {
				System.out.print("10진수 입력 : ");
				int n = sc.nextInt();
				
				System.out.print("변환 진수(2, 8, 6, 0) : ");
				int ch = sc.nextInt();

				m2(n, ch);
				System.out.println();
			} else if (menu == 3) {
				System.out.println("오름차순 : 1 / 내림차순 : 2");
				int n = sc.nextInt();
				sort(n, score);
			} else if (menu == 4) {
				System.out.print("번호입력 : ");
				int n = sc.nextInt();
				search(n, score);
			} else if (menu == 5) {
				break;
			} else {
				System.out.println("입력오류");
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
