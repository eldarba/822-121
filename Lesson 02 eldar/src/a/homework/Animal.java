package a.homework;

public class Animal {

	// attribute - ������ ��������
	private int age; // global to the class

	// CTOR - ���� - ����� ������ ������ �������
	public Animal(int age) {
		System.out.println("aaa");
		System.out.println("aaa");
		System.out.println("aaa");
		this.age = age;
		{ // block creates a scope and a name space
			int x = 5; // local to the block
			System.out.println(x);
		}

		{ // another block
			int x = 9;
			{
				
			}
		}

	}

	// method - ����� ����� ��� ��������
	public int getAge() {
		return age;
	}

	// method - ����� ������ ��� ��������
	public void setAge(int age) {
		this.age = age;
	}

}
