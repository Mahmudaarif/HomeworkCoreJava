package hw10UseOfSuperInChildClass;

public class Father {

	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	public Father() {

		System.out.println("This is defalt constructor from Father class");
	}

	public Father(String name, int age, char sex, boolean usCitizen) {

		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name: " + name + ",Age:" + age + ", Sex: " + sex + ", Uscitizen: " + usCitizen);

	}

	public void father() {
		System.out.println("This is void type method from father class ");
	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		
		this.name = name;
		this.age = age;
		this.sex = sex;
		this. usCitizen = usCitizen;
		System.out.println("Name: "+ name + ",Age: "+ age + ",Sex:" + sex + ", Us Citizen: "+ usCitizen);

	}

}
