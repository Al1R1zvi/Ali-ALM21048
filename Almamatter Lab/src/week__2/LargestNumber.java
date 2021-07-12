package week__2;

//8. Find the largest among 3 numbers using if-else-if

public class LargestNumber {

	public static void main(String[] args) {
		double n1 = -5.5, n2 = 4.5, n3 = 3;
		
		if(n1>n2&&n1>3) {
			System.out.println("Largest Number is..."+n1);
		}else if(n2>n1&&n2>n3) {
			System.out.println("Largest Number is..."+n2);
		}else {
			System.out.println("Largets Number is..."+n3);
		}

	}

}
