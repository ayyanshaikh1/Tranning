package publicSpecifer2;

public class SixClassHas_ASirQues {

	public static void main(String[] args) {
		
		StudentA s = new StudentA();
		Book b = new Book("Java", 150);
		s.hasA(b);
		System.out.println("-----------------");
		System.out.println(s.b.getJob());
		System.out.println(s.b.getWeight());
		Brain br = new Brain("Signal");
		s.hasB(br);
		System.out.println(s.bik.nameBk);

	}

}

class StudentA{

		HeartA b = new HeartA("pumping", 70);
		void hasA(Book b) {
			System.out.println(b.getNameB());
			System.out.println(b.getpriceB());
		}
		BikeA bik = new BikeA("Mt15",500000);
		void hasB(Brain br) {
			System.out.println(br.getBrain());
		}
}
class HeartA{
	String job;
	int weight;
	public HeartA(String job, int weight) {
		this.job = job;
		this.weight = weight;
	}
	public void setJob(String job) {
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
class Book{
	String nameB;
	int priceB;
	public Book(String nameB, int priceB) {
		this.nameB = nameB;
		this.priceB = priceB;
	}
	public void setNameB(String nameB) {
		this.nameB = nameB;
		
	}
	public void setpriceB(int priceB) {
		this.priceB = priceB;
	}
	public String getNameB() {
		return nameB;
	}
	public int getpriceB() {
		return priceB;
	}
	
}
class BikeA{
	String nameBk;
	int priceBk;
	public BikeA(String nameBk, int priceBk) {
		this.nameBk = nameBk;
		this.priceBk = priceBk;
	}
	public void setNameBk(String nameBk) {
		this.nameBk = nameBk;
		
	}
	public void setpriceBk(int priceBk) {
		this.priceBk = priceBk;
	}
	public String getNameBk() {
		return nameBk;
	}
	public int getpriceBk() {
		return priceBk;
	}
	
}
class Brain{
	String job;
	public Brain(String job) {
		this.job = job;
	}
	public void setBrain(String job) {
		this.job = job;
	}
	public String getBrain() {
		return job;
	}
	
}