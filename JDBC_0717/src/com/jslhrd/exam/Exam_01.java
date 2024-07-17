package com.jslhrd.exam;

import java.text.DecimalFormat;
import java.util.List;

import com.jslhrd.model.EmpDAO;
import com.jslhrd.model.EmpDTO;

public class Exam_01 {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		List<EmpDTO> list = dao.empList();
		DecimalFormat df = new DecimalFormat("#,###");
		int sum = 0;
		
		System.out.println("사원번호\t이름\t직급\t\t입사일자\t\t급여\t부서번호");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getEno() + "\t");
			System.out.print(list.get(i).getEname() + "\t");
			if (list.get(i).getJob().length() < 8) {
				System.out.print(list.get(i).getJob() + "\t\t");
			} else {
				System.out.print(list.get(i).getJob() + "\t");
			}
			System.out.print(list.get(i).getHiredate() + "\t");
			System.out.print(df.format(list.get(i).getSalary()) + "\t");
			System.out.print(list.get(i).getDno() + "\n");
			
			sum += list.get(i).getSalary();
		}
		
		System.out.println("급여합계\t\t\t\t\t\t" + df.format(sum));
	}

}
