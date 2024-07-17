package com.jslhrd.exam;

import java.text.DecimalFormat;
import java.util.List;

import com.jslhrd.model.EmpDAO;
import com.jslhrd.model.SalaryDTO;

public class Exam_05 {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		List<SalaryDTO> list = dao.jobSalary();
		DecimalFormat df = new DecimalFormat("#,###");
		
		System.out.println("직급\t\t최대급여\t최소급여");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getJob().length() < 8) {
				System.out.print(list.get(i).getJob() + "\t\t");
			} else {
				System.out.print(list.get(i).getJob() + "\t");
			}
			System.out.print(df.format(list.get(i).getMax()) + "\t");
			System.out.print(df.format(list.get(i).getMin()) + "\n");
		}
	}

}
