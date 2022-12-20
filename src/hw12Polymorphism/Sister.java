package hw12Polymorphism;

public class Sister {

	public void sister() {
		System.out.println("This void type method from the Sister class");
	}

	public int sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int add = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("Add all the age: " + add);
		return add;
	}

	public int sister(int age2, int age3, String age4, int age5) {
		int add = age2 + age3 + Integer.parseInt(age4) + age5;
		System.out.println("Add all teh age: " + add);
		return add;

	}

	public int sister(int age1, int age3, String age4, int age5, int age6) {
		int add = age1 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("Add all the age: " + add);
		return add;

	}

	public static int sister(int age1, int age3, int age5, int age6) {
		int add = age1 + age3 + age5 + age6;
		System.out.println("Add all the age: " + add);
		return add;

	}

	public final static int sister(int age1, int age5, int age6) {
		int add = age1 + age5 + age6;
		System.out.println("Add all the age: " + add);
		return add;

	}

	/*
	 * When there are multiple method with same name but different parameters is
	 * call method overloading.
	 */

}
	
	

	


