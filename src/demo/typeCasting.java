package demo;

public class typeCasting {

	public static void main(String[] args) {
		
		//Implicit Type Casting 
		// Smaller data type to Big data type --> Automatically by compiler
		byte a = 10;
		int b = a;
		System.out.println(a);
		System.out.println(b);
		
		int c = 10;
		double d = c;
		System.out.println(c);
		System.out.println(d);
		
		//Explicit Type Casting 
		//Bigger data type to Smaller data type --> Not Automatically by Compiler
		
		double e = 20;
		int f;
		f = (int)e;
		
		System.out.println(e);
		System.out.println(f);
		
		float g = 10.5f;
		System.out.println(g);
		
		long h = 2147483648l;
		System.out.println(h);
	}

}
