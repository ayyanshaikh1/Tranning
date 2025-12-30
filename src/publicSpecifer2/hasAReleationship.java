package publicSpecifer2;

public class hasAReleationship {

	public static void main(String[] args) {
		charger c = new charger();
		System.out.println(c.brand);

	}

}
class Laptop{
	String brand;
	String company;
	Laptop(String brand, String compant) {
		this.brand = brand;
	}
	public void setBrand(String Brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
}

class Os extends Laptop{
	String brand;
	float version;
	public Os(String brand , float version){
		this.brand = brand;
		this.version= version;
	}
	
}
class charger extends Laptop{
	String brand;
	int power;
	
}
