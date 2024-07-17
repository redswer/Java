package com.jslhrd.exam;

import java.text.DecimalFormat;
import java.util.List;

import com.jslhrd.model.DepartDTO;
import com.jslhrd.model.EmpDAO;

public class Exam_04 {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();		
		List<DepartDTO> list = dao.dInfo();
		DecimalFormat df = new DecimalFormat("#,###.##");
		int count = 0;
		
		System.out.println("부서번호\t사원수\t평균급여");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getDno() + "\t");
			System.out.print(list.get(i).getCount() + "\t");
			System.out.print(df.format(list.get(i).getSalary_avg()) + "\n");
			
			count += list.get(i).getCount();
		}
		
		System.out.println("총사원수\t" + count);
	}

}
