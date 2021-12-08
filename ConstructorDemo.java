package oopsConcepts;

public class ConstructorDemo {

	public static void main(String[] args) {
		//Call default constructor
		CarUsingConstructors c1 = new CarUsingConstructors();
		
		c1.setMake("BMW");
		System.out.println(c1.getMake());
		
		System.out.println(c1.speed);
		System.out.println(c1.gear);
		
		System.out.println("*********************");
		
		//Call constructor that accepts arguments
		CarUsingConstructors c2 = new CarUsingConstructors(10, 1);
		System.out.println(c2.speed);
		System.out.println(c2.gear);
	}
}