package week__2;


//13. While Loop Demonstration

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum=0, number;
		System.out.println("Enter any integer value below 10:");
		number = input.nextInt();
		
		while(number<=10) {
			sum = sum + number;
			number++;
			
		}
		System.out.println("Sum of numbers upto 10 is "+ sum);
	}

}
