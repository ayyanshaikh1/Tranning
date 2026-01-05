package ExceptionHandling;
import java.util.Scanner;


public class Exception1 {

	public static void main(String[] args) {
		System.out.println("Main connection Established");
		Test1 t1 = new Test1();
		t1.alpha();
		System.out.println("Main method Terminated");
	}

}
class Test1{
	void alpha() {
		System.out.println("Connection 1 Established");
		Test2 t2 = new Test2();
		t2.beta();
		System.out.println("connection 1 Terminated");
		
	}
}
class Test2{
	void beta() {
		System.out.println("Connection 2 Established");
		Test3 t3 = new Test3();
		t3.gamma();
		System.out.println("connection 2 Terminated");
	}
}
class Test3{
	void gamma() {
		System.out.println("Connection 3 Established");
		System.out.println("please enter Value 1");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Please enter value 2");
		int b = sc.nextInt();
		try {
		int c = a/b;
		System.out.println(c);
		}catch(Exception e) {
			System.out.println("Exception handled by gamma");
		}
		
		System.out.println("connection 3 Terminated");
		sc.close();
	}
	
}