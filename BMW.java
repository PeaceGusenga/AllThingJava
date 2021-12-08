package oopsConcepts;

public class BMW extends Vehicles {
	
	public BMW (int startSpeed) {
		super(startSpeed);
	}

	@Override
	public void increaseSpeed() {
		protectedSpeed++;
		Vehicles c1 = new Vehicles();
		c1.decreaseSpeed();
		System.out.println("Increasing Speed of BMW");
	}
	
	public void headupDisplayNavigation() {
		System.out.println("BMW Specific Functionality");
	}
	
	public void stop() {
		Vehicles c1 = new Vehicles();
		c1.decreaseSpeed();
	}
}