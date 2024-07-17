package com.jslhrd.exam;

import java.text.DecimalFormat;

import com.jslhrd.model.EmpDAO;
import com.jslhrd.model.SalaryDTO;

public class Exam_03 {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		SalaryDTO dto = dao.salaryCount();
		DecimalFormat df = new DecimalFormat("#,###");
		DecimalFormat df2 = new DecimalFormat("#,###.##");
		
		System.out.println("급여최대\t급여최소\t급여총액\t평균급여");
		System.out.print(df.format(dto.getMax()) + "\t");
		System.out.print(df.format(dto.getMin()) + "\t");
		System.out.print(df.format(dto.getSum()) + "\t");
		System.out.printf(df2.format(dto.getAvg()) + "\n");
	}

}
