package week__2;

//23. Check given a number is prime or not 

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		boolean prime = true;
		System.out.println("Enter a number to check if prime or not");
		num = sc.nextInt();
		int temp =1;
		for(int i=2;i<=num/2;i++) 
		 	{ 
				temp=num%i; 
				if(temp==0) 
				{ 
					prime=false; 
					break; 
				} 
		 	} 
		 //If isPrime is true then the number is prime else not
		if(prime) 
		 System.out.println(num + " is a Prime Number"); 
		 else
		 System.out.println(num + " is not a Prime Number");

	}

}
