package hw10UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth; 
	public int age;
	
	public Daughter() {
		super();
		super.familyName = "Akash";
		System.out.println("Family Name:" + familyName);
		System.out.println("This is default constractor");
			
	}
	
	public Daughter(String birthMonth, int age) {
		super("Mohammed", 65, 'M',true);
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth Month:"+ birthMonth + "Age:" + age);
		
		
	} 
	
	public void daughter () {
		super.father();
		System.out.println("This is void type method ");
	}
	 public void daughterInfo(String birthMonth, int age) {
		 super.fatherInfo("mohmmed", 65, 'M', true);
		 super.familyName = "Akash";
		 this.birthMonth = birthMonth;
		 this.age = age;
		System.out.println("Birth Month:"+ birthMonth + "Age:" + age);

		 
		 
	 }
	

}
