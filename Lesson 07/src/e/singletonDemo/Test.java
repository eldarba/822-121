package e.singletonDemo;

public class Test {

	public static void main(String[] args) {
		
		Superman s = Superman.getInstance();
		s.setAltitude(100);
		s.setSpeed(250);
		System.out.println(s);
		
		Superman mySuperman = Superman.getInstance();
		System.out.println(mySuperman);
	}
}
