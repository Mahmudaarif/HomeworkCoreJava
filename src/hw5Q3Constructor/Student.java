package hw5Q3Constructor;

public class Student {
	String stName;
	int stID;
	char sex;
	boolean isProgrammer;
	float grade;
	 
	
	public Student() {
		System.out.println("This is from default Constructor of Student class");
		
	}
	public Student(String stName,int stID, char sex,boolean isProgrammer,Float grade) {
		this.stName=stName;
		this.stID=stID;
		this.sex=sex;
		this.isProgrammer=isProgrammer;
		this.grade=grade;
		System.out.println("Student name is: "+stName+ "\nStudent ID is: "+stID+ "\nSex is: "+sex+ "Is this Programmer: "+isProgrammer+ "Grade is: "+grade);
	}
	 
		
	
	
	

}
