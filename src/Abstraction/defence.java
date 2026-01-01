package Abstraction;

public class defence {


		public static void main(String[] args) {
			System.out.println("<<<<<<<<<<<ARMY>>>>>>>>>>>");
			security(new Army());
			System.out.println("<<<<<<<<<<<NAVY>>>>>>>>>>>");
			security(new Navy());
			System.out.println("<<<<<<<<<<<AIRFORCES>>>>>>>>>>>");
			security(new AirForces());

		}
		static void security(securityForce s){
			s.protect();
		}

	}

	abstract class securityForce{
		abstract void protect();
		}
	class Army extends securityForce {
		public void protect(){
			System.out.println("Protect Nation");
		}
		void useTank() {
			System.out.println("Use on the land");
		}
	}
	class Navy extends securityForce {
		public void protect(){
			System.out.println("Protect Nation");
		}
		void useShips() {
			System.out.println("use on the Oceans");
		}
		
	}
	class AirForces extends securityForce{
		public void protect(){
			System.out.println("Protect Nation");
		}
		void useJets() {
			System.out.println("use on the Air Ways");
		}
		
	}
	

