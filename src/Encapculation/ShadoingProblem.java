package Encapculation;
import java.util.*;


public class ShadoingProblem {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Employee1 e1 = new Employee1();
		System.out.println("Enter the Name :");
		String name = sc.nextLine();
		System.out.println("Enter the Id :");
		int id = sc.nextInt();
		System.out.println("Enter the Salary :");;
		int salary = sc.nextInt();
		
		e1.setData(name, id, salary);
		System.out.println("Name : " +e1.getName());
		System.out.println("Id : " + e1.getId());
		System.out.println("Salary :" +e1.getSalary());
		
	}

}

class Employee1{
	private String name;
	private int Id;
	private int salary;
	
	public void setData(String name, int Id, int salary) {
		this.name = name;
		this.Id = Id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return Id;
	}
	public int getSalary() {
		return salary;
	}
}
