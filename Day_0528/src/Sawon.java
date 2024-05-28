
public class Sawon {
	int sabun;//사원번호
	String name;//이름
	int age;//나이
	boolean gender;//성별(true:남/false:여)
	
	public Sawon() {}
	
	public Sawon(int sabun,String name, int age, boolean gender) {
		this.sabun=sabun;
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	void sawonPrint() {
/*		String str="여자";
		if(gender) {
			str="남자";
		}
*/
		String str="";
		if(gender) {
			str="남자";
		}else {
			str="여자";
		}
		
		System.out.print(sabun + "\t" + name + "\t");
		System.out.print(age + "\t" + str + "\n");
	}
}
