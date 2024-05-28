
public class Score {
	int bun;
	String name;
	int score[];
	int tot;
	double avg;
	char grade;
	
	Score() {
	}
	
	Score(int bun, String name, int[] score) {
		this.bun = bun;
		this.name = name;
		this.score = score;
	}
	
	void totAvg() {
		grade();
		
		for (int i = 0; i < score.length; i++) {
			tot += score[i];
		}
		
		avg = (double) tot / score.length;
	}
	
	int max() {
		int max = score[0];
		
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
		}
		return max;
	}
	
	int min() {
		int min = score[0];
		
		for (int i = 0; i < score.length; i++) {
			if (score[i] < min) {
				min = score[i];
			}
		}
		
		return min;
	}
	
	void grade() {
		switch ((int) avg / 10) {
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
	}
	
	void printWithoutGrade() {
		System.out.printf("%d\t%s\t", bun, name);
		
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d\t", score[i]);
		}
		
		System.out.printf("%d\t%.2f\n", tot, avg);
	}
	
	void printWithGrade() {
		System.out.printf("%d\t%s\t", bun, name);
		
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d\t", score[i]);
		}
		
		System.out.printf("%d\t%.2f\t%s\n", tot, avg, grade);
	}
}
