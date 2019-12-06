package collections;

public class PermanentEmployee extends Employee {
	public PermanentEmployee() {
		name = "PE";
	}

	public void getPF() {
		System.out.println("Provident Fund");
	}

	public void getSalary() {
		System.out.println("Salary with extra benefits");
	}
	
	@Override
	public String toString() {
		return "PermanentEmployee [name=" + name + "]";
	}
}
