package week__2;

//6. Compute Quotient and Remainder

   //Check If Even or Odd
import java.util.Scanner;
public class QuotientRemainderConitnued {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Integer Number");
		int num = sc.nextInt(); //Entered number will be stored in 'num' variable
		
		String s = (num%2==0)?"The number is even":"The number is odd"; //Ternary operator
		System.out.println(s);
		
	}

}
