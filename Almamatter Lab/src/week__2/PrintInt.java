package week__2;

//2.  Java Program to Print an Integer (Entered by the User)

import java.util.Scanner;

public class PrintInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Creates a reader instant which takes input from the keyboard or any standard input
		System.out.println("Enter an integer");
		int num = sc.nextInt();
		
		System.out.println("You entered the integer...."+num);

	}

}

