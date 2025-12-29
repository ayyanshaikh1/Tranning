package Inheritance;

public class privateIngertance {

		public static void main(String[] args) {
			child c = new child();
		System.out.println(c.a);  // can not access the private variable
			System.out.println("In the Child class");
			c.disp();  //Can not access the private method 

		}

	}

	class parent{
	    private int a = 10;
	    int b = 20;
		private void disp() {
			System.out.println(a);
			System.out.println(b);
		}
		
	}
	class child extends parent{
		
	}
