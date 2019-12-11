package a.tirgul;

public class Tar05 {

	/*
	 * Create a class that calculates student average year grade.
	 * 
	 * o create a matrix according to the following:
	 * 
	 * there are 20 students in class
	 * 
	 * there are 10 different grades per student (randomize values between 0-100 as
	 * input)
	 * 
	 * o print each student average grade 
	 * 
	 * o print the class average grade
	 */
	public static void main(String[] args) {
		
		int students = 20;
		int grades = 10;
		double stdAVgSum = 0;
		
		int[][] studentGrades = new int[students][grades];
		
		for (int i = 0; i < studentGrades.length; i++) {
			System.out.print("student " + (i+1) + ":\t");
			int sum = 0;
			for (int j = 0; j < studentGrades[i].length; j++) {
				studentGrades[i][j] = (int) (Math.random()*31) + 70; // 70 - 100;
				System.out.print(studentGrades[i][j] + ", ");
				sum += studentGrades[i][j];
			}
			double stdAvg = (double)sum/grades;
			stdAVgSum += stdAvg;
			System.out.println("\tavg: " + stdAvg);
		}
		
		double classAvg = stdAVgSum/students;
		System.out.println("==============================");
		System.out.println("class avg: " + classAvg);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		

	}
}
