package Inheritance;

public class parentApp {

	public static void main(String[] args) {
		Child1 c = new Child1();
		System.out.println(c.a);
		System.out.println("In the Child class");
		c.disp();

	}

}

class parent{
    int a = 10;
    int b = 20;
	void disp() {
		System.out.println(a);
		System.out.println(b);
	}
	
}
class Child1 extends parent{
	
}


