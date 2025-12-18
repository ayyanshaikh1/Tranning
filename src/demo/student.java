package demo;

public class student {
	String name;
	int age;
	String gender;
	
	void study() {
		System.out.println("Student");
	}
	
	
   public static void main(String [] args) {
	   student s1 = new student();
	   System.out.println("Before Assigning the Values...");
	   System.out.println(s1.name);
	   System.out.println(s1.age);
	   System.out.println(s1.gender);
	   
	   System.out.println("After Assigning the Values...");
	   s1.name = "Ayyan";
	   s1.age = 21;
	   s1.gender ="Male";
	   
	   System.out.println(s1.name);
	   System.out.println(s1.age);
	   System.out.println(s1.gender);
   }
}
