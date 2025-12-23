package demo;
import java.util.StringTokenizer;

public class CalculateStringLength {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				String s = "Department of Computer6 Technology";
				StringTokenizer st = new StringTokenizer(s, " ");
				char [] ch = s.toCharArray();
				int len = 0;
				
				for(int i=ch.length-1; i>=0; i--) {
					len++;
				}
				System.out.println(len);

			}

		}

