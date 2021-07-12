package week__2;


//21. Reversing a Number 

import java.util.Scanner;
public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =0,reversenum=0;
		System.out.println("Enter a Number ");
		num = sc.nextInt();
		while(num!=0) {
			reversenum = reversenum*10;
			reversenum += num%10; // num%10 isolates each digit of the original number
			num = num/10;			
		}
		System.out.println("Reversed Number: "+reversenum);

	}

}
