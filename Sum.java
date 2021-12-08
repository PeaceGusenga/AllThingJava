package Chapter4;

public class Sum {

	/**
	 * The purpose of this program is to
	 * illustrate the for loop and one-dimensional arrays
	 */
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		for (int i = 0; i < a.length; i++){
			sum += a[i];
			
			// sum = sum + array "a" at location i
			// which means 1+2+3+... loop until i !< a.length.
		}
		System.out.println("The sum is: " + sum);
	}

}
