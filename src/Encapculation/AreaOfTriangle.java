package Encapculation;

import java.util.Scanner;

class Triangle{
	float base;
	float height;

public Triangle(float base, float height) {
	this.base= base;
	this.height = height;
	
	}
public float disp() {
	float area = (float) (0.5 *(base * height)); 
	return area;
}
}


public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height ");
		float h = sc.nextFloat();
		
		System.out.println("Enter the base ");
		float b = sc.nextFloat();
		
		Triangle t = new Triangle(h,b);
		System.out.println(t.disp());
		

	}

}
