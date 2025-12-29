package Inheritance;

public class rInheritance {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.a + " " +c.b);

	}

}

class parent{
	int a;
	int b;
	public parent() {
		a=10;
		b=20;
	}
	public parent(int a, int b) {
		this.a = a;
		this.b = b;
	}
	class Child extends parent{
		public Child() {
			a = 30;
			b = 40;
		}
		public Child(int a, int b) {
			this.a = a;
			this.b =b;
		}
	}
}
