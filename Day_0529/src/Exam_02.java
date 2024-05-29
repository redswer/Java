class Car {
	String name;
	int price;
	
	Car() {
	}
	
	Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

public class Exam_02 {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name = "산타페";
		c1.price = 200;
		
		Car c2 = new Car("소나타", 100);
		
		System.out.println("이름\t가격");
		System.out.printf("%s\t%d\n", c1.name, c1.price);
		System.out.printf("%s\t%d\n", c2.name, c2.price);
	}

}
