package ExceptionHandling;
import java.util.Scanner;

public class BankApp {


	class Bank1{
		void Banking() {
		System.out.println("Bank connection establish");
		ATM card = new ATM();
		try {
			card.tranasaction();
		}
		catch(Exception e) {
			System.out.println("Info recesive by the bank your money refund within the 24 hours");
		}
		System.out.println("Bank connection terminated");
		}
		
		
	}

	class ATM{
		void tranasaction() throws Exception  {
			System.out.println("Atm connection establish");
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the value 1:");
			int a = input.nextInt();
			System.out.println("Enter the value 2:");
			int b = input.nextInt();
			try {
				int c = a/b;
				System.out.println("c ="+c);
			}
			catch(Exception e){
				System.out.println("exception handled by atm");
				throw e;
			}
			finally {
				System.out.println("Atm connection terminated");
				input.close();
			}
		}
		
	}	

	public class BankApp1 {

		public static void main(String[] args) {
			System.out.println("main connection establish");
			Bank1 b = new Bank1();
			b.Banking();
			
			System.out.println("main connection is terminated");

		}

	}
	}
