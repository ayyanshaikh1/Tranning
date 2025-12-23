package demo;

public class CompareTo {

	public static void main(String[] args) {
		String s1 = "SACHIN";
		String s2 = "SAURAV";
		
		int res = s1.compareTo(s2);
		if(res > 0) {
			System.out.println("S1 is greater...");
		}
		else if(res < 0) {
			System.out.println("S2 is greater...");
		}
		else {
			System.out.println("Both string are Equal..");
		}
		System.out.println(s1.compareTo(s2));
	}
}
