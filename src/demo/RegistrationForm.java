
package demo;
import java.util.Scanner;

public class RegistrationForm {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		String email;
		int age;
		String gender;
		String mob;
		String add;
		int id;
		String college;
		long adhar;
		
		
		
		System.out.println("Enter the Name :");
		name = sc.nextLine();
		
		System.out.println("Enter Your Email :");
		email = sc.nextLine();
		
		
		System.out.println("Enter Your Age :");
		age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Your Gender :");
		gender = sc.nextLine();
		
		System.out.println("Enter Mobile Number :");
		mob = sc.nextLine();
		
		System.out.println("Enter Address :");
		add = sc.nextLine();
		
		System.out.println("Enter College Id :");
		id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Your College Name :");
		college = sc.nextLine();
		
		System.out.println("Enter Adhar Number :");
		adhar = sc.nextLong();
		
		System.out.println("Your Details are....");
		System.out.println("Name :" + name);
		System.out.println("Email :" + email);
		System.out.println("Age : " + age);
		System.out.println("Gender :" + gender);
		System.out.println("Mobile Number :" + mob);
		System.out.println("Address :" + add);
		System.out.println("College Id :" + id);
		System.out.println("College Name :"+ college);
		System.out.println("Adhar Number :"+ adhar);
		
	}

}
