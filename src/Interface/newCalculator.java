package Interface;
import java.util.*;
public class newCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a :");
		int a = sc.nextInt();
		System.out.println("Enter b :");
		int b = sc.nextInt();
		
		System.out.println("Enter the Operation :");
		System.out.println("+,-,/,*");
		char c = sc.next().charAt(0);
		
		switch(c) {
		case '+':
			System.out.println(a+b);
			break;
		
	    case '-':
		System.out.println(a-b);
	
	case '*':
		System.out.println(a+b);
	
	case '/':
		System.out.println(a/b);
	}
	}

}

	
	