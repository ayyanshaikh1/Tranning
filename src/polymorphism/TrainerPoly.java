package polymorphism;

public class TrainerPoly {
	public static void main(String [] args) {
     	///Polymorphism to be Acchived
		Trainer t;
		t = new JavaTrainer();
		t.teach();
		t = new ApptiTrainer();
		t.teach();
		t = new TestingTrainer();
		t.teach();
		
	}

}
class Trainer{
	public void teach(){
		System.out.println("Trainner Teaches...");
	}
	
}
class JavaTrainer extends Trainer{
	public void teach(){
		System.out.println("Java Trainner Teaches...");
	}
	
}
class ApptiTrainer extends Trainer{
	public void teach(){
		System.out.println("Apptitude Trainner Teaches...");
	}
}
class TestingTrainer extends Trainer{
	public void teach(){
		System.out.println("Testing Trainner Teaches...");
	}
}
