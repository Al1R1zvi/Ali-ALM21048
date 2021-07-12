package week__2;

//19. Area of Triangle

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of base of the triangle ");
		double base = sc.nextDouble();
		
		System.out.println("Enter the height of the triangle");
		double height = sc.nextDouble();
		
		double area = (base*height)/2;
		System.out.println("Area of the triangle = "+area);
		
	}
}
