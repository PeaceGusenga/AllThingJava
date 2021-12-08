package oopsConcepts;

public class Car {
	// color
	private String color;
	// make
	private String make;
	// model
	private String model;
	// year
	private int year;
	

	public void increaseSpeed() {
		System.out.println("Increasing the speed");
	}
	/*
	 * getters are methods with return types
	 */
	public String getMake() {
		return this.make;
	}
	// A setter is used to set values to fields
	//this. accesses the member variables and refers to the variable
	//outside of the method
	public void setMake(String make) {
		this.make = make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year > 1900) {
			this.year = year;
		} else {
			System.out.println("This year is not valid");
		}
	}
	
}