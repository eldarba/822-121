package c.arrays;

public class Demo04MultiDimArraysKefel {

	public static void main(String[] args) {

		int[][] matrix = new int[10][10];

		for (int i = 0, k1 = 1; i < matrix.length; i++, k1++) {
			for (int j = 0, k2 = 1; j < matrix[i].length; j++, k2++) {
				matrix[i][j] = k1 * k2;
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
