package ExceptionHandling;

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		System.out.println("connection established");
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter value 1 :");
		int a = sc.nextInt();
		System.out.println("pls enter value 2 :");
		int b = sc.nextInt();
		try {
			int c = a/b;
			System.out.println(c);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception Handled");
		}
		System.out.println("connection Terminated");
		sc.close();
	}

}
