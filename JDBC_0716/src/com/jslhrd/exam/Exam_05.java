package com.jslhrd.exam;

import java.util.List;
import java.util.Scanner;

import com.jslhrd.model.EmpDAO;
import com.jslhrd.model.EmpDTO;

public class Exam_05 {

	public static void main(String[] args) {
		// 입사년도를 입력받아 해당 년도에 입사한 사원의 번호, 이름, 업무, 급여, 부서번호 출력
		
		EmpDAO dao = new EmpDAO();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연도 입력 (xx 또는 xxxx): ");
		int year = sc.nextInt();
		String dname = "";
		int count = 0;
		
		if (year < 100) {
			year += 1900;
		}
		
		List<EmpDTO> list = dao.year(year);
		
		if (list.size() == 0) {
			System.out.println("해당 사원 없음");
		} else {
			System.out.println("번호\t이름\t업무명\t\t급여\t부서명");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getEno() + "\t");
				System.out.print(list.get(i).getEname() + "\t");
				if (list.get(i).getJob().length() < 8) {
					System.out.print(list.get(i).getJob() + "\t\t");
				} else {
					System.out.print(list.get(i).getJob() + "\t");
				}
				System.out.print(list.get(i).getSalary() + "\t");
				
				switch (list.get(i).getDno()) {
				case 10:
					dname = "전산부";
					break;
				case 20:
					dname = "총무부";
					break;
				case 30:
					dname = "인사부";
					break;
				case 40:
					dname = "경영부";
					break;
				}
				System.out.print(dname + "\n");
				count++;
			}
			
			System.out.println(year + "년 입사인원수 : " + count);
		}
		
	}

}
