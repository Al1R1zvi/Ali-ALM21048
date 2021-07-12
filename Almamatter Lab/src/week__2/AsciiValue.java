package week__2;

//5. Find the ASCII Value

public class AsciiValue {

	public static void main(String[] args) {
		char ch = 'H';
		int ascii = ch;
		//You can also cast char to int
		int casted_ascii_value = (int)ch;
		System.out.println("The ASCII value of " + ch + " is: " + ascii);
		System.out.println("The ASCII value of " + ch + " is: " + casted_ascii_value);

	}

}
