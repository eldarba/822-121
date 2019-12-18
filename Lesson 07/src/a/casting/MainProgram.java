package a.casting;

public class MainProgram {
	
	public static void main(String[] args) {
		
		Person[] persons = new Person[10];
		
		persons[0] = new Person("Dan");
		persons[1] = new Carpenter("Yosi");
		persons[2] = new Painter("Danna");
		persons[3] = new Carpenter("Yael");
//		persons[4] = new Phisician("Mark");
		persons[5] = null;
		persons[6] = new Person("John");
		persons[7] = new Painter("David");
		persons[8] = new Person("James");
		persons[9] = new Person("Dan");
		
		for (int i = 0; i < persons.length; i++) {
			Person curr = persons[i];
			if(curr != null) {
				curr.speak();
			}
		}
		
		System.out.println("==================");
		System.out.println("David is not feeling well.");
		System.out.println("We need a physician!");
		
		// create a reference of type Physician and initialize to null
		Physician physician = null;
		
		for (int i = 0; i < persons.length; i++) {
			Person curr = persons[i];
			if(curr instanceof Physician) {
				// found a physician - assign it the physician reference
				physician = (Physician) curr; // explicit casting after checking
				break;
			}
		}
		
		// did we find a physician
		if(physician != null) {
			System.out.println("we found Dr. " + physician.name);
			physician.treat(persons[7]);
		}else {
			System.out.println("We did not find a physician");
		}
		
		
	}

}
