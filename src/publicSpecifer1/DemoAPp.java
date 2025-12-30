package publicSpecifer1;

public class DemoAPp {
	public int a;
	protected int b;
	int c;
	private int d;

	public static void main(String[] args) {
		DemoAPp d = new DemoAPp();
		System.out.print(d.a);
		System.out.print(d.b);
		System.out.print(d.c);
		System.out.print(d.d);
	}
}
	class Demo1{
		void disp() {
			DemoAPp d = new DemoAPp();
			System.out.print(d.a);
			System.out.print(d.b);
			System.out.print(d.c);
//			System.out.print(d.d);
		}
	class Demo2 extends DemoAPp{
		void disp2() {
			System.out.print(a);
			System.out.print(b);
			System.out.print(c);
//       		System.out.print(d);
		}
		class Demo3 extends DemoAPp{
			void disp3() {
				System.out.print(a);
				System.out.print(b);
				System.out.print(c);
//	       		System.out.print(d);
			}

		
	}
}
