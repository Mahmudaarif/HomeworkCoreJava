package hw10Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

	public ColumbiaUniversity() {

	}

	// Abstract method can not be created in the class
	/*
	 * public abstract void chemistry();
	 * 
	 */

	/*
	 * Only one keyword (extends) is used for inheritance in java for a regular
	 * class regular class can inherit only one regular class or one abstract class
	 * by extends keyword regular class cann't inherit interface by extends keyword
	 * regular class can inherit multiple interface by implements keyword
	 * inheritance is possible.
	 */

	public void biology() {

		System.out.println("\"This is non abstract method from ColumbiaUniversity Class");
	}

	
	@Override
	public void caring() {
		// TODO Auto-generated method stub

	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lowInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void VocationalInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}

}
