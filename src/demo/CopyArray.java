package demo;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,5};
		
		int [] b =new int [a.length];
		for(int i=0; i<a.length; i++) {
			b[i] = a[i];
		}
		//Copy to b
		System.out.println("Elements are :");
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		///Reverse 
		System.out.println("Reverse Array :");
		for(int i=b.length-1; i>=0; i--) {
			System.out.println(b[i]);
		}

	}

}
