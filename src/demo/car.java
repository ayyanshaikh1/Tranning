package demo;

public class car {
	String name;
	String color;
	int maxSpeed;
	
	car(String name, String color, int maxSpeed){
		this.name = name;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	void drive() {
		System.out.println("Driving...");
	}
	
	public static void main(String [] args) {
		car c1 = new car("", "Black", 120);
		
		System.out.println(c1.name);
		System.out.println(c1.color);
		System.out.println(c1.maxSpeed);
	}

}
