package publicSpecifer2;

public class superprogram {

	public static void main(String[] args) {
		Child c = new Child();
		c.disp();

	}
}
class parent{
	int x = 10;
	void disp() {
		System.out.println(x);
	}
}
class Child extends parent{
	int x = 20;
	void disp() {
		System.out.println(x);
		System.out.println(super.x); // To print the Child class property	
	}
}