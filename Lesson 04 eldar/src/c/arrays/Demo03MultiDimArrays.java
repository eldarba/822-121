package c.arrays;

public class Demo03MultiDimArrays {

	public static void main(String[] args) {

		int[][] matrix = new int[10][10];

		for (int i = 0; i < matrix.length; i++) {
			// on each iteration we have an index for the current line
			for (int j = 0; j < matrix[i].length; j++) {
				// on each iteration we have an index for the current column
				matrix[i][j] = (int) (Math.random() * 101);
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
