package Encapculation;
class Employee{
	private String empName;
	private int empId;
	private int empSalary;
	
	public Employee(String name, int id, int salary) {
		empName = name;
		empId = id;
		empSalary = salary;
	}
	
	public String getName() {
		return empName;
	}
	public int getId() {
		return empId;
	}
	public int getSalary() {
		return empSalary;
	}
	
	
}

public class Constructor {

	public static void main(String[] args) {
		Employee e = new Employee("abc", 101, 10000);
		System.out.println(e.getName());
		System.out.println(e.getId());
		System.out.println(e.getSalary());

	}

}
