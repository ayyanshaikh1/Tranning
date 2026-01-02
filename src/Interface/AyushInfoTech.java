package Interface;

public class AyushInfoTech implements kodeCalci {
	int a;
	int b;
    public AyushInfoTech(int a, int b) {
    	this.a=a;
    	this.b=b;
    }
	@Override
	public void add() {
		int c=a+b;
       	System.out.println("Addition is "+c);
		
	}
	@Override
	public void sub() {
		int c=a-b;
    	    System.out.println("sub is "+c);
	}
	@Override
	public void mull() {
		int c=a*b;
    	   System.out.println("mul is "+c);
	}
	@Override
	public void div() {
		int c=a/b;
    	   System.out.println(c);
	}
}
