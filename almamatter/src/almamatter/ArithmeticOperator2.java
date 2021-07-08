package almamatter;

public class ArithmeticOperator2 {

	public static void main(String[] args) {
		int i =10;
		//i = i+1 or i++/++i
		//i++ is post increment
		//++i is pre increment
		//i = i-1 or i--/--i
		//i-- is post decrement
		//--i is pre decrement
		
		System.out.println("POST INCREMENT......");
		System.out.println(i);// this print i
		System.out.println(i++);// this also prints i but increments by 1 
		System.out.println(i);//prints the incremented value of i
		
		System.out.println("PRE INCREMENT");
		int k = 100;
		System.out.println(k);// this prints k
		System.out.println(++k);//this increments the value of k and then prints the value
		System.out.println(k);//prints incremented value of k
		
		
		System.out.println("POST DECREMENT....");
		int x=1000;
		System.out.println(x);//print 1000
		System.out.println(x--);//print 1000 - in post decrement - the x is printed first and incremented
		System.out.println(x);//print 999
		System.out.println("PRE DECREMENT.....");
		int y=2000;
		System.out.println(y);//print 2000
		System.out.println(--y);//print 1999 - in pre decrement - the y is incremented first and then printed
		System.out.println(y);//print 1999
	

	}

}
