package polymorphism;

public class RealPolymorphism {

	public static void main(String[] args) {
		duty(new javaTrainer());
		duty(new ApptiTrainer());
		duty(new TestingTrainer1());
		

	}
	static void duty(Trainer t) {
		t.teach();
	}

}

class Trainer{
	public void teach() {
		System.out.println("Trainer Teaches");
	}
}
class javaTrainer extends Trainer {
	public void teach() {
		System.out.println("Trainer Java");
	}

}
class ApptiTrainer extends Trainer{
	public void teach() {
		System.out.println("Trainer Appti");
	}
	
}
class TestingTrainer1 extends Trainer{
	public void teach() {
		System.out.println("Trainer Testing");
	}
	
}

