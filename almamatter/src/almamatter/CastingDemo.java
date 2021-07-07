package almamatter;

public class CastingDemo {

	public static void main(String[] args) {
		byte b=20;
		byte c=2;
		
		//byte d=b*c;//automatically gets promoted to int
		
		int myint = b*c;
		System.out.println(myint);
		
		byte d = (byte)(b*c); //this is called typecasting
		System.out.println(d);
        
		
		int myintvalue = 257;
		byte mybytevalue = (byte)myintvalue;
		
		System.out.println(mybytevalue);//when you convert int to byte, the value will be divided by 256 and the remainder is stored
		
		float f = 120.35f;
		int myintfloat = (int)f;
		System.out.println(myintfloat);// when you convert float to int, the decimal part is lost
		
		f = myintfloat; // float can store int values
		
		char ch = 'A';
		int myintchar = (int)ch;
		System.out.println(myintchar);
		int mycharint = 169;
		System.out.println((char)mycharint);
		
		
		
	}
	
}
