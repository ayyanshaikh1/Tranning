package demo;
import java.util.Scanner;
public class SearchElements {
	public static void main(String [] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the Elements : " +n);
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		boolean isFound = false;
		int idx = 0;
		
		
		System.out.println("Enter the Element to be find : ");
		int k = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == k) {
				isFound = true;
				idx = i;
				break;
			}
		}
		if(isFound) {
			System.out.println("Key found at Index " +idx);
		}
		else {
			System.out.println("Not Found");
		}
	}
}
