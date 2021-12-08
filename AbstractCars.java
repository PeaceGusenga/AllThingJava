package oopsConcepts;

public abstract class AbstractCars {
	
	private int privateSpeed;
	public int publicSpeed;
	
	protected int protectedSpeed;
	
	int speedLimit = 100 ;
	
	public AbstractCars () {
		this(0);
	}
	
	public AbstractCars (int startSpeed) {
		this.privateSpeed = startSpeed;
	}
	
	public void setPrivateSpeed(int pSpeed) {
		this.privateSpeed = pSpeed;
	}
	
	//Whichever class extends this abstract class must implement its abstract methods.
	//abstract methods have no body and are defined in the class which implements it.
	public abstract void engineStart(String keyType, int numOfCyl);
}