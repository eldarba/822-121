package f.objectMethods;

import a.Person;

public class Demo2 {
	
	public static void main(String[] args) {
		Person p = new Person(111, "aaa", 33);
		Person p2 = new Person(222, "bbb", 44);
		Person p3 = p2;
		
		System.out.println(p.toString());
		System.out.println(p2.toString());
		
		System.out.println(p.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
	}

}
