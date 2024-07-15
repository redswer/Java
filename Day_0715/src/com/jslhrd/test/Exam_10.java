package com.jslhrd.test;

import java.util.List;

import com.jslhrd.model.ExamDAO;
import com.jslhrd.model.Job_salaryDTO;

public class Exam_10 {

	public static void main(String[] args) {
		// 각 담당(job) 유형별로 급여 최고액, 최저액, 합계, 평균을 출력 (평균은 정수로 반올림)
		
		ExamDAO dao = new ExamDAO();
		List<Job_salaryDTO> list = dao.job();
		
		System.out.println("직업\t\t최고액\t최소액\t합계\t평균");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getJob().length() < 8) {
				System.out.print(list.get(i).getJob() + "\t\t");
			} else {
				System.out.print(list.get(i).getJob() + "\t");
			}
			System.out.print(list.get(i).getMax_salary() + "\t");
			System.out.print(list.get(i).getMin_salary() + "\t");
			System.out.print(list.get(i).getSum() + "\t");
			System.out.print(list.get(i).getAvg() + "\n");
		}
	}

}
