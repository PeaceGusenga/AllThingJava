package Chapter4;

public class BubbleSort {

	/**
	 * Purpose:
	 * To illustrate nested loop statements and one-dimensional arrays
	 * 
	 * Description:
	 * The following program-using the bubble sort algorithm-sorts the array in ascending
	 * order and prints the sorted array to the standard output.
	 * 
	 */
	public static void main(String[] args) {
		int a[] = { 21, 9, 45, 17, 33, 72, 50, 12, 41, 39};
		for (int i = a.length; --i >= 0; ){
			for(int  j = 0; j < i; j++){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j + 1] = temp;
				}
			}
		}
	//print the sorted array
		for (int k = 0; k < a.length; k++){
			System.out.println("a[" + k + "]: " + a[k]);
		}

	}

}
