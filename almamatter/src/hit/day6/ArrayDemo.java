package hit.day6;

public class ArrayDemo {

	public static void main(String[] args) {
		int marks[] = {98,97,99};
		
		//how many values is equivalent to the length of array
		//if array has 3 values then the length/size of array will be 3
		System.out.println(marks.length);//length is property of array which return the size of array
		
		//every box of an array has an address and it is called 'index'
		//by default all arrays start with the index as 0
		System.out.println(marks[0]);// this command will read the value of the 0 index
		//System.out.println(marks[3]);// this will throw an error - ArrayIndexOutofBoundException
		
		
		//Another way to declare an array
		int score[] = new int[3]; //declaration of an array of size 3 without initialization
		score[0]= 413;//assigns value 413 to array position 0
		score[1]=445;
		score[2]=342;
		
		System.out.println(score[2]);
		
		String s [] = {"ramu", "imran"};// this is an array of 'string' type
		System.out.println(s[1]);
	}
	

}
