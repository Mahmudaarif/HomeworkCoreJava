package hw4JavaVariables;
public class AboutMeTest {

	public static void main(String[] args) {
		// Class is instantiated here
		AboutMe obj=new AboutMe();
		// Variables are initialized here
		obj.name="Mahmuda Arif";
		obj.age=41;
		obj.Height=5.2f;
		obj.gender='f';
		obj.GPA=3.7;
		obj.Asian=true;
		obj.MonthlySalary=10000;
		obj.AllPropertyValue=98765432124368L;
		obj.HouseRent=22384;
		// aboutme method is initialized here
		obj.aboutMe();
		
		// Class is instantiated here
		AboutMe obj1=new AboutMe();
		// Variables are initialized here
		obj1.name="Alex";
		obj1.age=45;
		obj1.Height=6.3f;
		obj1.gender='M';
		obj1.Asian=false;
		obj1.MonthlySalary=90000;
		obj1.AllPropertyValue=89076543468975L;
		obj1.HouseRent=32000;
		// aboutme method is initialized here
		obj.aboutMe();
	}
	
}
