package com.jslhrd.bbb;

import java.util.*;

public class UserExam {
	/* [입력형식]
	 * 입력 : id, name, age
	 * 
	 * [처리조건]
	 * - id 중복 시 에러, id 가 end 면 종료
	 * - 입력 종료 시 전체 회원정보 출력
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = null;
		List<User> list = new ArrayList();
		
		while (true) {
			System.out.print("입력 : ");
			String s = sc.nextLine();
			st = new StringTokenizer(s, ", ");
			
			String id = st.nextToken();
			
			boolean bool = true;
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getId().equals(id)) {
					System.out.println("** 오류 - 중복된 id **");
					bool = false;
					break;
				}
			}
			
			if (!bool) {
				continue;
			} else if (id.equals("end")) {
				break;
			} else {
				String name = st.nextToken();
				int age = Integer.parseInt(st.nextToken());
				
				list.add(new User(id, name, age));
			}
			
		}
		
		System.out.println("id\t이름\t나이");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%s\t%s\t%d\n", list.get(i).getId(), list.get(i).getName(), list.get(i).getAge());
		}
	}

}
