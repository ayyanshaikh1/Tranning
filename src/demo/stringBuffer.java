package demo;

public class stringBuffer {
	public static void main(String [] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Ronaldo");
		System.out.println(sb.capacity());
		sb.append("is a greater footboller");
		System.out.println(sb.capacity());
		
		StringBuffer sbr = new StringBuffer(100);
		System.out.println(sbr.capacity());
		
		StringBuffer s1 = new StringBuffer();
		s1.ensureCapacity(31);
		System.out.println(s1.capacity());
		
		sb.trimToSize();
		System.out.print(sb.capacity());
		
	}
}
