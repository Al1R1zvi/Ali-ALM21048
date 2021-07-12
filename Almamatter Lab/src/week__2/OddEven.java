package week__2;


//10. Check whether a given number is ODD or EVEN ? 

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Integer Number");
		int num = sc.nextInt(); //Entered number will be stored in 'num' variable
		
		String s = (num%2==0)?"The number is even":"The number is odd"; //Ternary operator
		System.out.println(s);
		
	}


}


