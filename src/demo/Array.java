package demo;
import java.util.Scanner;

public class Array {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Colleges :");
		int x = sc.nextInt();
		System.out.println("Enter the Number of Classes :");
		int y = sc.nextInt();
		System.out.println("Enter the Number of Students :");
		int z = sc.nextInt();
		int a [][][] = new int[x][y][z];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				for(int k=0; k<a[i][j].length; k++) {
					System.out.println("Enter College " +i+ " college " +j+ " Student " +k);
					a[i][j][k] = sc.nextInt();
				}
			}
		}
		System.out.println("Details are");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				for(int k=0; k<a[i][j].length; k++) {
					System.out.println(a[i][j][k] + " ");
				}
			}
		}
	}

}
