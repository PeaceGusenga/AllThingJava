package Exercise;

import java.util.Scanner;


public class Phone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PhoneFunctions p1 = new PhoneFunctions();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please give make of phone:");
		p1.setType(scan.nextLine());
		System.out.println("You are using a "+p1.getType());

		System.out.println("To turn on phone press 1");
		p1.setState(scan.nextInt());
		
		System.out.println("Please give a number between 1 - 100 for brightness percentage: ");
		p1.setBrightness(scan.nextInt());
		System.out.println("Phone brightness is "+ p1.getBrightness());
		
		System.out.println("Please set Volume level between 1-100: ");
		p1.setVolume(scan.nextInt());
		
		System.out.println("Please give favorite song:");
		p1.setMusic(scan.nextLine());
		
	}

}
