package hw9Abstraction;

public class ColumbiaUniversity extends MedicalSchool{

	public ColumbiaUniversity() {

	}

	// Abstract method can not be created in the class
	/*
	 * public abstract void chemistry();
	 * 
	 */
	
	/*
	 * Only one keyword (extends) is used for inheritance in java for a regular class
	 * regular class can inherit only one regular class or one abstract class by extends keyword
	 * regular class cann't inherit interface by extends keyword
	 * regular class can inherit multiple interface by implements keyword
	 */

	public void biology() {

		System.out.println("\"This is non abstract method from ColumbiaUniversity Class");
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void caring() {
		// TODO Auto-generated method stub
		
	}



}
