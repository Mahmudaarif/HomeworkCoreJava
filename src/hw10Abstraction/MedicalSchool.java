package hw10Abstraction;

import hw8Abstraction.NursingSchool;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {

	/*
	 * only one keyword (extends)is used to inherit abstract class in abstract class
	 * an abstract class can inherit one regular class or one abstract class by
	 * extends keywords an abstract class cannot inherit interface by extends
	 * keywords but an abstract can inherit more than one interface by implements
	 * keyword
	 */

	public MedicalSchool() {
		// Constructor can be created in the abstract Class
	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is non abstract method");

	}
}