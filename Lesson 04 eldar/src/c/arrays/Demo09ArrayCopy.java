package c.arrays;

import java.util.Arrays;

public class Demo09ArrayCopy {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8, 10 };
		System.out.println(Arrays.toString(arr));

		// we want to add 2 more elements
		// we need to create a longer array
		int[] temp = new int[arr.length + 2];
		// copy all elements to the new array
		System.arraycopy(arr, 0, temp, 0, arr.length);

		arr = temp; // give the arr reference a new address (for the longer array)
		temp = null; // disconnect the temp reference from the new array

		System.out.println(Arrays.toString(arr));
		arr[5] = 1;
		arr[6] = 1;
		System.out.println(Arrays.toString(arr));

	}

}
