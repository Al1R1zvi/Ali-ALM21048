package week__2;

//20. Find Area of Circle


import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle");
		double radius = sc.nextDouble();
		
		double area = Math.PI*radius*radius;
		System.out.println("Area of Cirle = "+area);

	}

}
