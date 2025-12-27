package Encapculation;

import java.util.Scanner;

public class Student {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		StudentInfo s1 = new StudentInfo();
		System.out.println("Enter the Name :");
		String name = sc.nextLine();
		System.out.println("Enter the age :");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Gender :");
		String gender = sc.nextLine();
		s1.setData(name, age,gender);
		
		System.out.println("Name :" +s1.getName());
		System.out.println("Age :" +s1.getAge());
		System.out.println("Gender :" +s1.getGender());
	}
	
}

class StudentInfo{
	private String name;
	private int age;
	private String gender;
	
	public void setData(String n, int a, String g) {
		name = n;
		age = a;
		gender = g;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender(){
		return gender;
	}
}
