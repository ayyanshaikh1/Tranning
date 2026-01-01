package Abstraction;

public class Shapes {

	public static void main(String[] args) {
	 duty1(new Circle(5));
	 duty1(new Square(5));
	 
	}
	static void duty1(shapes1 s) {
		s.dispArea();
	}
}
abstract class shapes1{
	double area;
	abstract void findArea();
	abstract void dispArea();
	
}
class Circle extends shapes1{
	float pi = 3.14f;
	int r;
	public Circle( int r) {
		this.r = r;
	}

	@Override
	void findArea() {
		area=pi*r*r;
		
	}

	@Override
	void dispArea() {
		
		System.out.println(area);
	}
	
}
class Triangle extends Shapes{ 
	int l;
	int b;
	public Triangle(int l, int b){
		this.l = l;
		this.b = b;
	}
	 

}
class Square extends shapes1{
	int side;
	
	public Square(int side) {
		this.side = side;
	}

	@Override
	void findArea() {
		area=side*side;
	}

	@Override
	void dispArea() {
		System.out.println(area);
		
	}	
}
