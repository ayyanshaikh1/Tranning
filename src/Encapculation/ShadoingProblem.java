package Encapculation;

	class employee{
		private String empName;
		private int empId;
		private int empSalary;
		
		public Employee(String empName, int empId, int empSalary) {
			this.empName = empName;
			this.empId = empId;
			this.empSalary = empSalary;
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

	public class ShadoingProblem {

		public static void main(String[] args) {
			Employee e = new Employee("abc", 101, 10000);
			System.out.println(e.getName());
			System.out.println(e.getId());
			System.out.println(e.getSalary());

		}

	}


}
