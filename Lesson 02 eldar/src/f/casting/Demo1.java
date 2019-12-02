package f.casting;

public class Demo1 {

	public static void main(String[] args) {

		// (Type)
		{
			int x = 500;
			long y = x; // implicit casting from int to long
			byte z = (byte) y; // explicit casting from long to byte (can overflow)
			System.out.println(z);
		}

		{
			double x = 3.5;
			int y = (int) x; // explicit casting
		}

		{
			char c = 'A';
			System.out.println(c + " - " + (int) c); // char to int
			char tet = 'è';
			System.out.println(tet + " - " + (int) tet); // char to int
			System.out.println((char) (tet + 1) + " - " + (tet + 1)); // char to int
		}
	}
}
