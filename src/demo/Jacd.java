package demo;

public class Jacd {

	public static void main(String[] args) {
		
		int a[][][] = new int [3][][];
		a[0] = new int [2][];
		a[1] = new int [1][];
		a[2] = new int [3][];
		a[0][0] = new int [3];
		a[0][1] = new int[2];
		a[1][0] = new int[4];
		a[1][1] = new int [2];
		a[2][1] = new int [3];
		a[2][2] = new int [4];
		
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
