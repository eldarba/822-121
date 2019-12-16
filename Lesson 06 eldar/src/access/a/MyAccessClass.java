package access.a;

public class MyAccessClass {

	private int privateVar = 1; // visible in this class only
	int defaultVar = 2; // default is package private - visible from same package
	protected int protectedVar = 3; // visible in same package or subclasses
	public int publicVar = 4; // visible from everywhere
	
	
	public static void main(String[] args) {
		
		MyAccessClass x = new MyAccessClass();
		
		System.out.println(x.privateVar);
		System.out.println(x.defaultVar);
		System.out.println(x.protectedVar);
		System.out.println(x.publicVar);
	}
}
