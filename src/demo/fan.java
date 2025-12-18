package demo;

public class fan {
	String brand;
	int cost;
	String color;
	
	void speed() {
		System.out.println("Speed");
	}

	public static void main(String[] args) {
		fan f1 = new fan();
		System.out.println("Before Assigning...");
		System.out.println(f1.brand);
		System.out.println(f1.cost);
		System.out.println(f1.color);
		
		System.out.println("After Assigning...");
		f1.brand = "abc";
		f1.cost = 2000;
		f1.color = "Black";
		
		System.out.println(f1.brand);
		System.out.println(f1.cost);
		System.out.println(f1.color);
		
		fan f2 = new fan();
		System.out.println("Before Assigning...");
		System.out.println(f2.brand);
		System.out.println(f2.cost);
		System.out.println(f2.color);
		
		System.out.println("After Assigning...");
		f2.brand = "xyz";
		f2.cost = 1000;
		f2.color = "Red";
		
		System.out.println(f2.brand);
		System.out.println(f2.cost);
		System.out.println(f2.color);
		
		
		
	}

}
