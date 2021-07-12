package week__2;

//3. Multiply Two Numbers

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of i...");
		int i = sc.nextInt();
		
		System.out.println("Enter the value of j...");
		int j = sc.nextInt();
		
		System.out.println(i +" x " +j);
		int product = i*j;
		System.out.println("Product =  "+product);
		
	}

}
