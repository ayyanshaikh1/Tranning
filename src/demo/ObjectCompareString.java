package demo;

public class ObjectCompareString {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String s1 = "John";
			String s2 = new String("Arsh");
			
			if(s1 == s2) {
				System.out.println("Reference are Equal");
			}
			else {
				System.out.println("Reference are Not Equal");
			}	
			if(s1.equals(s2)){
				System.out.println("Values are Equal");
			}
			else {
				System.out.println("Values are Not Equal");
			}
		}
	}

