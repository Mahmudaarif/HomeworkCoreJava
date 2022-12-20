package hw12Polymorphism;

public class Niece extends Sister {

	@Override
	public int sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int add = age1 / 2 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("Add all the age: " + add);
		return add;
	}

	@Override
	public int sister(int age1, int age3, String age4, int age5, int age6) {
		int add = age1 + 3 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("Add all the age: " + add);
		return add;

	}

	@Override
	public void sister() {
		System.out.println("This void type method from the Sister class");
	}
	/*
	 * When you have multiple method with same name also the parameter is same its
	 * call method overridden. Static and final can't not overridden.
	 */

}
