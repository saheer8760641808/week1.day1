package week3.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testing = "I am a selenium tester";

	    String[] p = testing.split(" ");
	    
	    for (int i = 1; i < p.length; i += 2)
	    	
	       p[i] = new StringBuilder(p[i]).reverse().toString();
	    
	    System.out.println(String.join(" ", p));
	    
	}

}
