package f.objectMethods;

import a.Person;

public class Demo4 {

	public static void main(String[] args) {
		
		Person p1 = new Person(111, "aaa", 33);
		Person p2 = new Person(111, "Aaa", 34);
		Person p3 = new Person(333, "bbb", 33);
		
		System.out.println(p1.equals(p2));
	}
}
