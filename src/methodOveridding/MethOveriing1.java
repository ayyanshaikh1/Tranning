package methodOveridding;

public class MethOveriing1 {

}

 class Parent{
	void disp() {
		System.out.println("This is parent Method");
	}
}

class Child extends Parent{
	void disp() {
		System.out.println("This is Child Method");
	}
}