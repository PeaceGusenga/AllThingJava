package oopsConcepts;

import oopsConcepts.BMW;
import oopsConcepts.Vehicles;

public class InheretanceDemo {

	public static void main(String[] args) {
		int speed = 10;
		
		Vehicles c1 = new Vehicles(speed);
		c1.increaseSpeed();
		c1.publicSpeed = 10;
		
		BMW bmw1 = new BMW(speed);
		bmw1.increaseSpeed();
		bmw1.headupDisplayNavigation();
	}

}
