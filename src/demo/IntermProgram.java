package demo;

public class IntermProgram {

	public static void main(String [] args) {
		String s1 = new String("Deep");
		String s2 = s1.intern();
		String s3 = s1.intern();
		if(s2 == s3) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not");
		}
	}
}
