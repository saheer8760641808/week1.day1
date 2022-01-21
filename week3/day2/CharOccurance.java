package week3.day2;

public class CharOccurance {

		
		String str = "welcome to chennai";


		 public static int MAX_CHAR = 256;

		 public static void getOccuringChar(String str)
		 {
		     int count[] = new int[MAX_CHAR];

		     int len = str.length();

		     // Initialize count array index
		     for (int i = 0; i < len; i++)
		         count[str.charAt(i)]++;

		     // Create an array of given String size
		     char ch[] = new char[str.length()];
		     for (int i = 0; i < len; i++) {
		         ch[i] = str.charAt(i);
		         int find = 0;
		         for (int j = 0; j <= i; j++) {
		             if (str.charAt(i) == ch[j])
		                 find++;
		         }

		         if (find == 1)
		             System.out.println(
		                 "Number of Occurrence of "
		                 + str.charAt(i)
		                 + " is:" + count[str.charAt(i)]);
		     }
		 }

		 public static void main(String[] args)
		 {
		     String str = "welcome to chennai";
		     
		     getOccuringChar(str);
		 }

	}


