package hw5Q2Constructor;
/*
Create a package name "hw5Q2Constructor" in your Home Work project. Inside the package, a) Create a class "Computer". Declare some variable -- brand, model, operating system, price, grade (grade as char) and madeInUSA. Declare default constructor and more than one parameterized constructor. Use only one System.out.println() in each constructor. b) Create another class ComputerTest. Create object from Computer class, as many as you want under main method. Initialize all the constructors. I want in console, the first outcome as -> This is from default Constructor of Computer class. Second outcome as-> My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: $800, Grade: A and Made in U SA? Ans: false. I want the third outcome in console for your configuration. Organize your code. Push in the github. Paste your github link below*/

public class Computer {
	
	String brand; //apple
	String model; //null
	String operatingSystem; //macbookAir
	int price;
	char grade;
	boolean madeInUSA;

	public Computer() {
		System.out.println("This is from default Constructor of Computer class");
	}

	public Computer(String brand,String model,String operaratingSystem,int price,char grade,boolean madeInUSA){
		this.brand=brand;
		this.model = model;
	    this.operatingSystem=operaratingSystem;
	    this.price=price;
	    this.grade=grade;
	    this.madeInUSA=madeInUSA;
		System.out.println("My brand: " + brand + "\nModel: " + model + "\nOperating system: " +operaratingSystem+ "\nPrice: "+price + "\nGrade:" +grade +"\nMade in: "+madeInUSA);
	}


	
	public Computer(String brand,String model,String operaratingSystem,int price,boolean madeInUSA,char grade){
		this.brand=brand;
	    this.model=model;
	    this.operatingSystem=operaratingSystem;
	    this.price=price;
	    this.madeInUSA=madeInUSA;
	    this.grade=grade;
		System.out.println("My brand: " + brand + "\nModel: " + model + "\nOperating system: " +operaratingSystem+ "\nPrice: "+price + "\nMade in: "+madeInUSA+"\nGrade:" +grade);
	}


	public void method1(){
		System.out.println("This is from void method");
	}
	
	
	
	public String xyz(){
		
	return "This is from xyz method";
	
	}
	

}


