package access.a;

public class A {

	public static void main(String[] args) {
		
		MyAccessClass x = new MyAccessClass();
		
//		System.out.println(x.privateVar);
		System.out.println(x.defaultVar);
		System.out.println(x.protectedVar);
		System.out.println(x.publicVar);
	}
}
