package almamatter;
import java.util.Scanner;
public class ArithemticOperator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter i value...");
		int i = scan.nextInt();
		
		System.out.println("Please enter j value...");
		int j = scan.nextInt();
		
		int add = i+j;
		System.out.println("Addition ...." + add);
		
		int sub = i-j;
		System.out.println("Subtraction..." +sub);
		
		int mul = i*j;
		System.out.println("Multiplication..." +mul);
		
		int div = i/j;
		System.out.println("Division.../" +div);
		
		int rem = i%j;
		System.out.println("Remainder..." +rem);

	}

}
