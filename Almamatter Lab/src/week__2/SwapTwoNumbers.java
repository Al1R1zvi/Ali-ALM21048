package week__2;


//9. Swap Two Numbers

public class SwapTwoNumbers {

	public static void main(String[] args) {
		float first = 2.50f, second = 4.50f;
		System.out.println("Before Swapping...");
		System.out.println("First Number = "+first);
		System.out.println("Second Number = "+second);
		
		float temp = 0f; 
		temp = first; //This variable will store the first number temporarily
		first = second; //The value of 'second' is now assigned to 'first'
		second = temp; // The value of 'temp' which already has the original value of 'first' is now assigned to'second'
		System.out.println("After Swapping..."); //The numbers are swapped now
		System.out.println("First Number = "+first);
		System.out.println("Second Number = "+second);
	}

}
