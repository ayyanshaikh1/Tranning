package MultiThreading;

public class runableCode {
		public static void main(String[] args) {
			Thread t1 = new Thread(new Typing1());
			Thread t2 = new Thread(new SpellCheck1());
			Thread t3 = new Thread(new Saving1());
			
			
			t1.start();
			t2.start();
			t3.start();
		}

	}

	class Typing1 implements Runnable{
		public void run() {
			for(int i=0;i<10; i++) {
				System.out.println("Typing.....");
			
			try {
			Thread.sleep(600);
		}catch(Exception e){
			System.out.println("Exception");
		}
		
		}
		}
	}
	class SpellCheck1 implements Runnable{
		public void run() {
			for(int i=0; i<10; i++) {
				System.out.println("Spell Check.....");
				try {
					Thread.sleep(600);
				}catch(Exception e){
					System.out.println("Exception");
				}
			}
		
		}
	}


	class Saving1 implements Runnable{
		public void run() {
			for(int i=0; i<10; i++) {
				System.out.println("Saving.....");
				try {
					Thread.sleep(300);
				}catch(Exception e){
					System.out.println("Exception");
				}
			}
		
		}
	}




