package publicSpecifer2;

public class methodFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class parent {
	final void disp() {
		System.out.println("This is parent Method");
	}
}
class child extends parent{ 
	void disp() {  // we can not oveeride the final class
		System.out.println("This is Child Class");
	}
}