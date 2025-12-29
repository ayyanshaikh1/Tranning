package Inheritance;

public class securityProgram {

	public static void main(String[] args) {
		
		System.out.println("<<<<<<<<<<<<<<<ARMY>>>>>>>>>>>>>");
	
		Army a = new Army();
		a.job();
		a.protect();
		a.useTank();
		
		System.out.println("<<<<<<<<<<<<<<<NAVY>>>>>>>>>>>>>");
		Navy n = new Navy();
		n.job();
		n.protect();
		n.useShips();
		
		System.out.println("<<<<<<<<<<<<<<<AIR FORCES>>>>>>>>>>>>>");
		AirForce af = new AirForce();
		af.job();
		af.protect();
		af.useJets();

	}
	
}

class SecurityForce{
	void job(){
		System.out.println("This is job");
	}
	void protect() {
		System.out.println("Protection to the Nation");
	}
	
}
class Army extends SecurityForce {
	void job(){
		System.out.println("Army uses");
	}
	void useTank() {
		System.out.println("Use on the land");
	}
	
}
class Navy extends SecurityForce{
	void job(){
		System.out.println("Navy Uses");
	}
	void useShips() {
		System.out.println("use on the Oceans");
	}
	
}
class AirForce extends SecurityForce{
	void job(){
		System.out.println("Air Crafts");
	}
	void useJets() {
		System.out.println("use on the Air Ways");
	}
	
}
