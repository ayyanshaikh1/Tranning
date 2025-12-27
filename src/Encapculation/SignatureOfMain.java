package Encapculation;

public class SignatureOfMain {

	 public static void main(String [] args) {
		System.out.print("The Main accepting the String type array.");
		System.out.println();
		main();
		int [] a = {1,2,3,4};
		main(a);
	}
	 public static void main(char a) {
		 System.out.println("The Main not accepting the Character type array.");
	
	 }
	 public static void main(int [] arr) {
		 System.out.println("The Main accepting the Integer type array.");
	 }
	 public static void main() {
		 System.out.println("The Main accepting the any Arguments.");
	 }
}
