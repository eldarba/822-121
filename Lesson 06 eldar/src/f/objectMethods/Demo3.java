package f.objectMethods;

public class Demo3 {

	public static void main(String[] args) {
		
		String str1 = new String("aaa");
		String str2 = new String("aaa");
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}
}
