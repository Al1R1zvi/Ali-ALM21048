package week__2;

//7. Given a Character check whether it’s a vowel or not

public class CheckVowel {

	public static void main(String[] args) {
		char ch = 's';
		
		String s = (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')?"It is a vowel":"It is not a vowel" ;
		System.out.println(s);

	}

}
