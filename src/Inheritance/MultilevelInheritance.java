package Inheritance;

public class MultilevelInheritance {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.a);
		System.out.println(c.b);

	}

}

class GrandParent{
	int a = 10;
}
class Parent extends GrandParent{
	int b = 20;
}
class Child extends Parent{
	
}
