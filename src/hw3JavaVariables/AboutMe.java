package hw3JavaVariables;

public class AboutMe {
//variable declare	
	public String collageName;
//variable initialize	
	public String name = "Mahmuda arif";
	public byte age = 41;
	public float myHeight = 5.4319431f;
	public char sex = 'f';
	public double myGrade = 3.52231587632;
	public boolean USCitizen = false;
	public int myMonthlySalary = 5000;
	public long myAllPropertyValue = 99876543211234L;
	public short myHouseRent = 32398;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println("My name is: " + aboutMe.name + "\nMy age is: " + aboutMe.age);

	}

}
