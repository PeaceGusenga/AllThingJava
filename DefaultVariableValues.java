package introduction;
/*
 * We define variables outside
 * of main method to make the 
 * variable global.
 * 
 * Global means that the variable can
 * be used everywhere
 * 
 * when a variable is global, it has a
 * default value
 * 
 * Variables used in the main method should
 * always be initialized(have a value)
 */
public class DefaultVariableValues {
	
	static byte byteVariable;
	static short shortVariable;
	static int integerVariable;
	static long longVariable;
	static float floatVariable;
	static double doubleVariable;
	static boolean booleanVariable;
	static char charVariable;
	
	public static void main(String[] args) {
		System.out.println("Byte Value: " + byteVariable);
		System.out.println("Short Value: " + shortVariable);
		System.out.println("Int Value: " + integerVariable);
		System.out.println("Long Value: " + longVariable);
		System.out.println("Float Value: " + floatVariable);
		System.out.println("Double Value: " + doubleVariable);
		System.out.println("Boolean Value: " + booleanVariable);
		System.out.println("Char Value: " + charVariable);
	}
	
	public static void oneMoreMethod() {
		System.out.println("Int Value: " + integerVariable);
	}
}