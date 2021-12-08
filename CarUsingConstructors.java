package oopsConcepts;

public class CarUsingConstructors {

	private String make;
	int speed;
	int gear;
	/*
	 * Example of Constructors (No argument)
	 */
	public CarUsingConstructors() {
		this(10, 2);
		this.speed = 0;
		this.gear = 0;
		System.out.println("Executing constructor without arguments");
	}
	//Example of constructor (with argument)
	public CarUsingConstructors(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
		System.out.println("Executing constructor with arguments");
	}
	
	// "this" refers to the instance of the class (object)
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getMake() {
		return make;
	}
}
