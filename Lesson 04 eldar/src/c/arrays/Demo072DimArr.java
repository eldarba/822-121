package c.arrays;

public class Demo072DimArr {

	public static void main(String[] args) {

		// creating a 2 dimensional array. each array of int is of different length
		int[][] arr = new int[5][];

		arr[0] = new int[10];
		arr[1] = new int[2];
		arr[2] = new int[7];
		arr[3] = new int[23];
		arr[4] = new int[12];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
