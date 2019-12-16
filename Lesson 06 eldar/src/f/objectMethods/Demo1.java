package f.objectMethods;

import animals.Cat;

public class Demo1 {
	
	Object o;
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		
		
		System.out.println(cat.toString());
		
//		cat = null;
		System.out.println(cat);
	}

}
