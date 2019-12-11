package e.ctorsAndInheritance;

public class A {

	// 1. CTORS are not inherited

	// 2. if no CTOR is provided we get a default CTOR
	// public A() {
	// }

	// 3. if a CTOR is provided default CTOR is vanished

	// 4. the first line of ANY ctor is a call to another CTOR
	// a. other ctor in the current class
	// b. other ctor in a super class
	// c. if no such call is written the default call is super()

	public A() {
		super(); // invoke CTOR in the super class
		System.out.println("from A CTOR");
	}

	public static void main(String[] args) {
		C c = new C();
	}

}
