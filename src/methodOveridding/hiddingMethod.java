package methodOveridding;

public class hiddingMethod {

	public static void main(String[] args) {
		Parent10 p = new Parent10();
		p.disp();
		Child1 c = new Child1();
		c.disp();
		Parent10 p1 = new Child1();
		p1.disp();

	}

}

class Parent10{
	static void disp() {
		System.out.println("This is parent Method");
	}
}

class Child1 extends Parent10{
	static void disp() {
		System.out.println("This is child Method");
	}
}
