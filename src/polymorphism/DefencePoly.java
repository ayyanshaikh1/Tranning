package polymorphism;

public class DefencePoly {

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
		s.job();
	}

}

class securityForce{
	public void job(){
		System.out.println("Job is Protection");
		}
	void protect() {
		System.out.println("Protection to the Nation");
	}
	
}
class Army extends securityForce {
	public void job(){
		System.out.println("Army uses");
	}
	void useTank() {
		System.out.println("Use on the land");
	}
}
class Navy extends securityForce {
	public void job(){
		System.out.println("Navy Uses");
	}
	void useShips() {
		System.out.println("use on the Oceans");
	}
	
}
class AirForces extends securityForce{
	public void job(){
		System.out.println("Air Crafts");
	}
	void useJets() {
		System.out.println("use on the Air Ways");
	}
	
}