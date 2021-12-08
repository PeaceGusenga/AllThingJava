package oopsConcepts;

public class AbstractDemoBMW extends AbstractCars {
	
	public void setPrivateSpeed(int speed) {
		super.setPrivateSpeed(10);
	}	

	@Override
	//Abstract methods must be implemented when extending an abstract class
	public void engineStart(String keyType, int numOfCyl) {
		System.out.println("This is the BMW engine start");
		System.out.println("Every child class may have different implementation");
	}
}