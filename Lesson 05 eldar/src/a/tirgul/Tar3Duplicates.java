package a.tirgul;

import java.util.Arrays;

public class Tar3Duplicates {

	public static void main(String[] args) {
		/*
		 * Create a class that eliminates duplications.
		 * 
		 * The class should be capable of getting an array with duplicated values and
		 * return an array of unique values generated from it.
		 * 
		 * For example, for the input
		 * 
		 * {1,2,5,1,6,1,5,4,8} the result should be
		 * 
		 * {1,2,5,6,4,8}
		 * 
		 * 1. create an array[10] of numbers with random values between 0-10
		 * 
		 * 2. create an array with the required size to host the unique values
		 * 
		 * 3. fill the unique array
		 * 
		 * 4. print both arrays
		 */

		// 1.
		int[] arr1 = new int[10];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 11);
		}
		
//		arr1[2] = 0;
//		arr1[4] = 0;
		arr1[8] = 0;
		arr1[9] = 0;
		System.out.println(Arrays.toString(arr1)); // print arr1

		// 2.
		int[] arr2 = new int[10];
		System.out.println(Arrays.toString(arr2)); // print arr2

		// 3. fill the unique array
		int length = 0; // length of new array, index for the new element
		
		// fill the unique array (with unique values)
		lbl:for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < length; j++) {
				if(arr1[i]==arr2[j]) { // a duplicate was found
					continue lbl; // copy will be skipped (continue is applied to lbl loop)
				}
			}
			// a duplicate was not found - copy number from arr1 to arr2
			arr2[length] = arr1[i]; // add element to arr2
			length++; // arr2 length was increased by one
		}
		System.out.println(length);
		System.out.println(Arrays.toString(arr2)); // print arr2
		
		// set the length of arr2 to the variable "length"
		int[] tempArr = new int[length];
		System.arraycopy(arr2, 0, tempArr, 0, length);
		arr2 = tempArr;
		
		// print arr2
		System.out.println(Arrays.toString(arr2)); // print arr2
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
