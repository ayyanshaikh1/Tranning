package demo;

import java.util.StringTokenizer;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I am Iron Man";
		StringTokenizer st = new StringTokenizer(s, " ");
		char [] ch = s.toCharArray();
		String n = new String();
        
		
		for(int i=ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);
			n.concat(ch[i]);
			}
		
		StringTokenizer st1 = new StringTokenizer(s, " ");
	}
}
