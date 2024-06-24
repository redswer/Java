package com.jslhrd.ccc;

import java.util.*;

public class StudentExam {
	/* [입력예시]
	 * 입력 : 1101,이학생,90,88,90
	 * 입력 : 1110,박학생,90,90,89
	 * 입력 : 0
	 * 
	 * [출력]
	 * 학번   이름   국어   영어   수학   총점   평균   판정   순위
	 * 
	 * [처리조건]
	 *  - 학번이 같으면 같은 학생이므로 "이미 등록된 학생입니다" 경고문을 출력 후 재입력
	 *  - 평균은 소수 이하 첫 번째 자리끼지 출력
	 *  - 90 이상 : 수, 80 이상 : 우, 70 이상 : 미, 60 이상 : 양, 60 미만 : 가
	 *  - 학번이 0 이 입력되면 종료 후 출력
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList();
		StringTokenizer st = null;
		
		while(true) {
			System.out.print("입력 : ");
			String s = sc.nextLine();
			st = new StringTokenizer(s, ",");
			
			String bun = st.nextToken();
			
			boolean bool = true;
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getBun().equals(bun)) {
					System.out.println("[ 이미 등록된 학생입니다. ]");
					bool = false;
					break;
				}
			}
			
			if (!bool) {
				continue;
			} else if (bun.equals("0")) {
				break;
			} else {
				String name = st.nextToken();
				int kor = Integer.parseInt(st.nextToken());
				int eng = Integer.parseInt(st.nextToken());
				int math = Integer.parseInt(st.nextToken());
				
				list.add(new Student(bun, name, kor, eng, math));
			}
		}
		
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t판정\t순위");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getBun() + "\t");
			System.out.print(list.get(i).getName() + "\t");
			System.out.print(list.get(i).getKor() + "\t");
			System.out.print(list.get(i).getEng() + "\t");
			System.out.print(list.get(i).getMath() + "\t");
			
			list.get(i).setTot(list.get(i).getKor() + list.get(i).getEng() + list.get(i).getMath());
			list.get(i).setAvg(list.get(i).getTot() / 3.0);
			
			switch ((int)list.get(i).getAvg() / 10) {
				case 10:
				case 9:	
					list.get(i).setGrade('A');
					break;
	
				case 8:
					list.get(i).setGrade('B');
					break;
					
				case 7:
					list.get(i).setGrade('C');
					break;
					
				case 6:
					list.get(i).setGrade('D');
					break;
				
				default:
					list.get(i).setGrade('F');
					break;
			}
			
			int r = 1;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).getTot() < list.get(j).getTot()) {
					r++;
				}
			}
				list.get(i).setRank(r);
			
			System.out.print(list.get(i).getTot() + "\t");
			System.out.printf("%.1f\t", list.get(i).getAvg());
			System.out.print(list.get(i).getGrade() + "\t");
			System.out.print(list.get(i).getRank() + "\n");
		}
	}

}
