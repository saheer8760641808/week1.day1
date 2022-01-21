package week3.day2;

public class PalindromeNumberExample {

	
		public static void PalindromeCheck(String str)
		{
		// reverse the input String
		String rev = new StringBuffer(str).reverse().toString();
		// checks whether the string is palindrome or not
		if (str.equals(rev))
		{
		System.out.println("input string is :" + str);
		System.out.println("Reversed string is :" + rev);
		System.out.println("Since the input and reversed string are equal, "+ str +" is a palindrome");
		}
		else
		{
		System.out.println("input string is :" + str);
		System.out.println("Reversed string is :" + rev);
		System.out.println("Since the input and reversed string are not equal, "+ str +" is not a palindrome");
		}
		}
		public static void main (String[] args)
		{
		PalindromeCheck("MADAM");
		}

	

}
