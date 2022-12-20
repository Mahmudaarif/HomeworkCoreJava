package hw11Abstraction;

import hw8Abstraction.NursingSchool;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {

	/*
	 * only one keyword (extends)is used to inherit abstract class in abstract class
	 * an abstract class can inherit one regular class or one abstract class by
	 * extends keyword but an abstract class can inherit more than one interface by
	 * implements keyword
	 */

	public MedicalSchool() {
		// Constructor can be created in the abstract Class
	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is non abstract method");

	}

	// default method can't be created in abstract class
	/*
	 * public default void name(){ }
	 * 
	 */
}