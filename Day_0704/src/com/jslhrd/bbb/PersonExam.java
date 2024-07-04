package com.jslhrd.bbb;

import java.io.*;
import java.util.*;

public class PersonExam {
	// person.txt 파일이 있으면 출력, 없으면 Scanner 로 입력받아 생성
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		File file = new File("src/person.txt");
		List<Person> list = new ArrayList<>();
		
		if(!file.exists()) {
			while(true) {
				System.out.print("정보입력 : ");
				String person = sc.nextLine();
				String p[] = person.split(",");
				
				int bun = Integer.parseInt(p[0]);
				if (bun == -99) {
					break;
				}
				
				String name = p[1];
				int age = Integer.parseInt(p[2]);
				
				list.add(new Person(bun, name, age));
			}
			
			ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
			oos.writeObject(list);
			oos.close();
		}
		
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
		list = (List) ois.readObject();
		ois.close();
		
		System.out.println("번호\t이름\t나이");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

}
