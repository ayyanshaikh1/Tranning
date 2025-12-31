package publicSpecifer2;

public class Student {

	public static void main(String[] args) {
	Student1 s = new Student1();
	Bike b = new Bike("Suv", 450000,"Black");
	s.hasA(b);
//	s = null; To Destroy the Object
	System.out.println("----------------------");
	System.out.println(s.h.getJob());
	System.out.print(s.h.getWeight());
	
	}
}

class Student1{
	Heart h = new Heart("Pump", 350);
	void hasA(Bike  b) {
		System.out.println(b.getBrand());
		System.out.println(b.getPrice());
		System.out.println(b.getColor());
	}	
	}


class Bike {
	String Brand;
	int price;
	String color;
	public Bike(String Brand, int price, String color) {
		this.Brand = Brand;
		this.price = price;
		this.color = color;
	}
	public void setBrand(String Brand) {
		this.Brand = Brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand(){
		return Brand;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
}

class Heart{
	String job;
	int weight;
	public Heart(String job, int weight) {
		super();
		this.job = job;
		this.weight = weight;
	}
	
	public void setjob(String job) {
		this.job = job;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String getJob() {
		return job;
	}
	public int getWeight() {
		return weight;
	}
}
