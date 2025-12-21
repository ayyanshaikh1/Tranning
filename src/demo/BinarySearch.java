package demo;
import java.util.*;
public class BinarySearch {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the Elements : " +n);
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the Element to be find : ");
		int k = sc.nextInt();
		
		int low = 0;
		int high = arr.length-1;
		int mid = (low+high) /2;
		boolean isFound = false;
		int ans = 0;
		
		while(low <= high) {
			if(arr[mid] == k) {
				isFound = true;
				ans = mid;
				break;
			}
			else if(k < arr[mid]) {
				high = mid - 1;
				mid = (low + high) /2;
			}
			else {
				low = mid + 1;
				mid = (low + high) /2;
			}
		}
		if(isFound) {
			System.out.println("Found at Index : " + ans);
		}
		else {
			System.out.println("Not Found");
		}
	}

}
