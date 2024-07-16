package com.jslhrd.exam;

import java.text.DecimalFormat;
import java.util.*;

import com.jslhrd.model.EmpDAO;
import com.jslhrd.model.EmpDTO;

public class Exam_04 {

	public static void main(String[] args) {
		// 키보드로 급여를 입력받아 입력된 급여 이상을 받는 사원의 번호, 이름, 입사일자, 급여를 출력(급여가 많은 사원부터 출력, 급여는 세자리마다 ',' 사용, 입사일자는 년월일 사용)
		
		EmpDAO dao = new EmpDAO();
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###");
		
		System.out.print("급여 입력 : ");
		int salary = sc.nextInt();
		int sum = 0;
		
		List<EmpDTO> list = dao.salaryOver(salary);
		
		System.out.println("번호\t이름\t입사일자\t\t급여");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getEno() + "\t");
			System.out.print(list.get(i).getEname() + "\t");
			System.out.print(list.get(i).getHiredate().substring(0, 4) + "년");
			System.out.print(list.get(i).getHiredate().substring(5, 7) + "월");
			System.out.print(list.get(i).getHiredate().substring(8, 10) + "일\t");
			System.out.print(df.format(list.get(i).getSalary()) + "\n");
			
			sum += list.get(i).getSalary();
		}
		
		System.out.println("총급여\t\t\t\t" + df.format(sum));
	}

}
