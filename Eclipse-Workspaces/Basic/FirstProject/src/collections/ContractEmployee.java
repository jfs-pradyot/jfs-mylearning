package collections;

public class ContractEmployee extends Employee {
	@Override
	public String toString() {
		return "ContractEmployee []";
	}

	public ContractEmployee() {
		name="EmployeeName";
		name = "CE"+name;
	}

	public void takeMonthsOfLeave() {
		System.out.println("Months of Leave!");
	}
	public void add(int a, int b){
		System.out.println("hello");
		
	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		Employee emp1=new ContractEmployee();
//		emp1.add(10,20);
	}
}