package Basics;

public class Weather {
	public static void main(String[] args){
		//This program will give a suggestion of what to wear 
		//based on the weather.
		
		int temperature = 65;
		String sunCondition = "Sunny";
		
		if(temperature > 80){
			System.out.println("It' pleasant to wear shorts and t-shirt");
		}else if ((temperature > 60) && ( sunCondition == "Sunny")){
			System.out.println("It's a little cooler. Perhaps wear a long sleeve shirt and jeans.");
		}
		else{
			System.out.println("Looks like a cold day. Bring a sweater");
		}
	}
}
