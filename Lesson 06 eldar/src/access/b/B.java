package access.b;

import access.a.MyAccessClass;

public class B extends MyAccessClass {
	
	int x;
	
	public B() {
		x = protectedVar;
	}
	
	public void  myMethod() {
		
		MyAccessClass x = new MyAccessClass();
		
//		System.out.println(x.privateVar);
//		System.out.println(x.defaultVar);
		System.out.println(protectedVar);
		System.out.println(x.publicVar);
	}
	
	

}
