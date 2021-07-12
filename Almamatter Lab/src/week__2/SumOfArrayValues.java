package week__2;


//24. Program to Sum the elements of an Array 

public class SumOfArrayValues {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("The sum of the elements of the array = "+sum);
	}

}
