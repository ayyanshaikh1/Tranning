package demo;

import java.util.Scanner;

public class ReverseNumber {

		public static void main(String [] args) {
			
			//With Third Variable
			int a = 10;
			int b = 20;
			int temp = 0;
			
			 temp = a;
			a = b;
			b = temp;
			
			System.out.println(a);
			System.out.println(b);
			
			///Without Third Variable 
			a = a + b;
			b = a - b;
			a = a - b;
			
			System.out.println();
			System.out.println(a);
			System.out.println(b);
			
			

	}

}
