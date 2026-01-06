package MultiThreading;

public class kodeEditor {

	public static void main(String[] args) {
		Typing t1 = new Typing();
		SpellCheck t2 = new SpellCheck();
		Saving t3 = new Saving();
		
		t1.start();
		t2.start();
		t3.start();
	}

}

class Typing extends Thread{
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
class SpellCheck extends Thread{
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


class Saving extends Thread{
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


