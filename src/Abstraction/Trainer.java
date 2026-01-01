package Abstraction;

public class Trainer {

		public static void main(String [] args) {
			duty(new JavaTrainer1());
			duty(new ApptiTrainer1());
			duty(new TestingTrainer1());
			
		}
		static void duty(Trainer1 t) {
			t.teach1();
		}
	}
	 abstract class Trainer1{
		abstract void teach1();
	}
	 
	class JavaTrainer1 extends Trainer1{
		public void teach1(){
			System.out.println("Java Trainner Teaches...");
		}
	}
	
	class ApptiTrainer1 extends Trainer1{
		public void teach1(){
			System.out.println("Apptitude Trainner Teaches...");
		}
	}
	
	class TestingTrainer1 extends Trainer1{
		public void teach1(){
			System.out.println("Testing Trainner Teaches...");
		}	
	}
	



