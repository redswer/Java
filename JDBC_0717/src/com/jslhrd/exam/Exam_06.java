package com.jslhrd.exam;

import java.text.DecimalFormat;
import java.util.List;

import com.jslhrd.model.DepartDTO;
import com.jslhrd.model.EmpDAO;

public class Exam_06 {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		List<DepartDTO> list = dao.departInfo();
		DecimalFormat df = new DecimalFormat("#,###");
		
		System.out.println("부서번호\t부서명\t\t사원수\t평균급여");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getDno() + "\t");
			if (list.get(i).getDname().length() < 8) {
				System.out.print(list.get(i).getDname() + "\t\t");
			} else {
				System.out.print(list.get(i).getDname() + "\t");
			}
			System.out.print(list.get(i).getCount() + "\t");
			System.out.print(df.format(list.get(i).getSalary_avg()) + "\n");
		}
	}

}
