package problems;

public class StringReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I am going home";
		
		String str1[] = str.split("\s");
		
		StringBuilder sb = new StringBuilder();
		
//		System.out.println("Number of words : "+str1.length);
		
		int len = str1.length - 1;
		
		while(len >= 0)
		{
			System.out.print(str1[len]+" ");
			sb.append(str1[len]+" ");
			len--;
		}
		
		System.out.println("\nReversed String : "+sb);
		
	}

}
