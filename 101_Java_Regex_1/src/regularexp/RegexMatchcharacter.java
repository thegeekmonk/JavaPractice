package regularexp;

import java.util.regex.Pattern;

public class RegexMatchcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Pattern.matches("\\d","abc"));
		System.out.println(Pattern.matches("\\d","12"));
		System.out.println(Pattern.matches("\\d","5"));
		
		
		System.out.println(Pattern.matches("\\D","abc"));
		System.out.println(Pattern.matches("\\D","a"));
		
		
		
	}

}
