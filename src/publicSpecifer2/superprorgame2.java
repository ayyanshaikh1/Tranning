package publicSpecifer2;

public class superprorgame2 {

	public static void main(String[] args) {
				Child c = new Child();
				c.disp();

			}

		}
		class parent{
			int x = 10;
			void disp() {
				System.out.println("This is parent method");
			}
		}
		class Child extends parent{
			int x = 20;
			void disp() {
				super.disp();
				System.out.println("This is Child Class");
			
				
			}
		}
	
