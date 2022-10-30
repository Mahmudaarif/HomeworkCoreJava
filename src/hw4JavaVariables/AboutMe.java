package hw4JavaVariables;

public class AboutMe {
	   // variable is declared here	
		public String collageName;
		public String name;
		public byte age;
		public float Height;
		public char gender;
		public double GPA;
		public boolean Asian;
		public int MonthlySalary;
		public long AllPropertyValue;
		public short HouseRent;
		
		// constructor is implemented here
		public AboutMe() {
			System.out.println("This is all about us: ");
		}
		// method is implemented here
		public void aboutMe() {
			System.out.println("My name is: "+name+"\nMy age is: "+age+"\nmyHeight is: "
			+Height+"\nMyGender is : "+gender+"\n"+"\nMyGPA is: "
			+GPA+"\nMyRace is: "+Asian+"\nMy monthly salsry is: "+MonthlySalary
			+"\nMy all property value is: "+AllPropertyValue+"\nMy house rent is: "+HouseRent);
		}

}


