package hit.day6;

public class LoopingDemo {

	public static void main(String[] args) {
		int x = 10;
		
		while (x>0) { //pre condition check
			if (x%2==0) {
				System.out.println("Even number... "+x);
			}
			else {
				System.out.println("Odd number..."+x);
			}
			--x;
		}
		x= 10;
		do {//post condtion check
			String s = (x%2==0)? "Even number"+x:"Odd number"+x;
			System.out.println(s);
			--x;
		}while(x>0);
	}

}
