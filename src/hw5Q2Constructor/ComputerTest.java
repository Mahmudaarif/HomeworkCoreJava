package hw5Q2Constructor;
/*
Create a package name "hw5Q2Constructor" in your Home Work project. Inside the package, a) Create a class "Computer". Declare some variable -- brand, model, operating system, price, grade (grade as char) and madeInUSA. Declare default constructor and more than one parameterized constructor. Use only one System.out.println() in each constructor. b) Create another class ComputerTest. Create object from Computer class, as many as you want under main method. Initialize all the constructors. I want in console, the first outcome as -> This is from default Constructor of Computer class. Second outcome as-> My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: $800, Grade: A and Made in U SA? Ans: false. I want the third outcome in console for your configuration. Organize your code. Push in the github. Paste your github link below*/
public class ComputerTest {
	public static void main(String[] args) {
		Computer comp1 = new Computer();
		Computer com2=new Computer("Apple","MacBook Air","MacOS Mojave",800,'A',false);
		System.out.println("****************************");
		//Computer com3=new Computer("Window","Window 10","agfg",650, true, 'A');
		//comp1.method1();
		//System.out.println(comp1.xyz());
		//System.out.println("My model" + com2.model + "\nMy brand " + com2.brand);
		//comp1.brand= "dell";
		//comp1.grade='A';
		Computer com3 = new Computer("Samsung", "Galxsy", "Windows", 900, false,'A' );
		
		
	}

}
