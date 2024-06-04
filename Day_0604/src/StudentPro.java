// 학생들의 데이터 처리(정렬, 순위 등)

public class StudentPro {
	int s1_tot;
	int s2_tot;
	int s3_tot;
	int s4_tot;
	int s5_tot;
	
	double s1_evg;
	double s2_evg;
	double s3_evg;
	double s4_evg;
	double s5_evg;
	
	void rank(Student[] s, int cnt) {
		for (int i = 0; i < cnt; i++) {
			 s[i].rank = 1;
			for (int j = 0; j < cnt; j++) {
				if (s[i].tot < s[j].tot) {
					s[i].rank++;
				}
			}
		}
	}
	
	void subject(Student[] s, int cnt) {
		for (int i = 0; i < cnt; i++) {
			s1_tot += s[i].s1;
			s2_tot += s[i].s2;
			s3_tot += s[i].s3;
			s4_tot += s[i].s4;
			s5_tot += s[i].s5;
		}
		
		s1_evg = (double)s1_tot / cnt;
		s2_evg = (double)s2_tot / cnt;
		s3_evg = (double)s3_tot / cnt;
		s4_evg = (double)s4_tot / cnt;
		s5_evg = (double)s5_tot / cnt;
	}
	
	void sort(Student[] s, int cnt) {
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (s[i].rank > s[j].rank) {
					Student tmp = s[i];
					s[i] = s[j];
					s[j] = tmp;
				}
					
			}
		}
	}
}
