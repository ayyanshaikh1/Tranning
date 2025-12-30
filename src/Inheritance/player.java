package Inheritance;


class player1{
	String name;
	int age;
	String gender;
	
	//Constructor
	class FootBall extends player1{
		int goals;
		int assist;
		public FootBall(String name, int age, String gender, int goals, int assist) {
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.goals = goals;
			this.assist = assist;
		}
			
			public int getGoals() {
				return goals;
			}	
			public int getAssist(){
				return assist;
            }
			public String getName() {
				return name;
			}
	}
     public class player {
    	 public 
		FootBall b = new FootBall("Abc",24,"Male",30,20);
		b.getGoals();
		
		

	}

}
