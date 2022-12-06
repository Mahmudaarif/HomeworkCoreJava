package hw9Encapsulation;

public class EmplyeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Mahmuda");
		employee.setAge(41);
		employee.setSex('F');
		employee.setUsCitizen(true);

		System.out.println("Employee name: " + employee.getName() + "\nEmployee age: " + employee.getAge()

				+ "Employee sex: " + employee.getSex() + "\nIs employee US citizen? " + employee.getusCitizen());

	}

}
