package Encapculation;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.println("Enter the Name :");
		String name = sc.nextLine();
		System.out.println("Your Name :" +s.getName());
		
		System.out.println("Enter your Age : ");
		int age =sc.nextInt();
		
		System.out.println("Your Age :" +s.getName());	
		
				
	}
}

class Student1{
	private String name;
	private int age;
	private String gender;
	
	public void setData(String n, int a, String gen) {
		name = n;
		age = a;
		gender = gen;
	}
	public String getName() {
		return name;
	}
	
	public int getAge(int age){
		return age;
	}

	public string getGender(String gen) {
		return gender;
	}
	
}
