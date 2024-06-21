package com.jslhrd.bbb;

public class StudentDAO {
	void process(Student st) {
		int max = st.getScore()[0];
		int min = st.getScore()[0];
		int tot = 0;
		double avg = 0;
		
		for (int i = 0; i < st.getScore().length; i++) {
			if (max < st.getScore()[i]) {
				max = st.getScore()[i];
			} else if (min > st.getScore()[i]) {
				min = st.getScore()[i];
			}
			
			tot += st.getScore()[i];
		}
		
		avg = (double)tot / st.getScore().length;
		
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%.2f\n", st.getBun(), st.getName(), st.getScore()[0], st.getScore()[1], st.getScore()[2], st.getScore()[3], st.getScore()[4], max, min, tot, avg);
	}
}
