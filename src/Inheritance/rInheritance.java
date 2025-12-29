package Inheritance;

public class rInheritance {

	public static void main(String[] args) {
		BaseClass c = new BaseClass();
		System.out.println(c.a + " " +c.b);

	}

}

class SupperClass{
	int a;
	int b;
	public SupperClass() {
		a=10;
		b=20;
	}
	public SupperClass(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
	class BaseClass extends SupperClass{
		public BaseClass() {
			a = 30;
			b = 40;
		}
		public BaseClass(int a, int b) {
			this.a = a;
			this.b =b;
		}
	}

