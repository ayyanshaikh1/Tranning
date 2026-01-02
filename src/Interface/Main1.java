package Interface;
import java.util.*;
public class Main1 {
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a and b");
	char a = sc.nextchar();
	String b = sc.nextLine();
	
	System.out.println(a);
	System.out.println(a);

//	disp(new AyushInfoTech(a,b));
}
	
	static void disp(kodeCalci c) {
		c.add();
		c.sub();
		c.mull();
		c.div();
	}
}
