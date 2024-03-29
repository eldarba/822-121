package a.tirgul;

import java.util.Arrays;

public class Tar04 {

	/*
	 * Create a class that reverse a given array order. For example, for the input
	 * 
	 * {6,8,4,2,7,5} the result should be
	 * 
	 * {5,7,2,4,8,6}. 
	 * 
	 * o create an array[10] of numbers with random values between
	 * 0-10 to be used as an input
	 * 
	 * o print the array before and after reversing
	 */
	public static void main(String[] args) {
		
		int[] arr1 = new int[10];
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 11);
		}
		
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2 = new int[10];

		for (int i = 0, j = 9; i < arr1.length; i++, j--) {
			arr2[j] = arr1[i];
		}
		
		System.out.println(Arrays.toString(arr2));
		

	}

}
