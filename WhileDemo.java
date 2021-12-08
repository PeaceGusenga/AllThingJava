package introduction;

public class WhileDemo {

	public static void main(String[] args) {
		
		int i = 10;
		
		/*while (i < 10) {
			//System.out.println(i);
			i++;
			if (i == 17) {
			
			//continue jumps to beginning of loop and skips rest of code block
				continue;
			}
			System.out.println("Value of i " + i);
		}
		System.out.println("Outside loop...");*/
		
		
		//do-while run first think after
		do {
			//System.out.println("do while loop...");
			System.out.println(i);
			i++;
			
		} while (i < 10);
	}
}