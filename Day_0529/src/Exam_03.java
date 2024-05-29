
class Person {
	int bun;
	String name;
	int age;
	
	Person () {}
	
	Person(int bun, String name, int age) {
		this.bun = bun;
		this.name = name;
		this.age = age;
	}
	
	void print() {
		System.out.println(bun + "\t" + name + "\t" + age);
	}
}

public class Exam_03 {
	public static void main(String[] args) {
		Person p[] = new Person[10];
		
		p[0] = new Person(1481, "김", 24);
		p[1] = new Person(1237, "이", 27);
		p[2] = new Person(2437, "나", 35);
		p[3] = new Person(1458, "박", 57);
		
		System.out.println("주민번호\t이름\t나이");
		for (int i = 0; i < 4; i++) {
			System.out.printf("%d\t%s\t%d\n", p[i].bun, p[i].name, p[i].age);
		}
	}
	
}
