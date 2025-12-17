package demo;

public class Robot {
	String brand;
	String os;
	String micro;
	
	Robot(String brand, String os, String micro){
		this.brand = brand;
		this.os = os;
		this.micro = micro;
	}
	

		void move() {

		System.out.println("Robot is Moving....");
	}
	void fight() {
		System.out.println("Robot is Fighting...");
	}
	
	public static void main(String [] args) {
		Robot r1 = new Robot("Robot1", "Windo", "I5");
		System.out.println(r1.brand);
		System.out.println(r1.os);
		System.out.println(r1.micro);
		
	}

}
