package week1.day1;

public class ArmsrongNumber {

	public static void main(String[] args) {
		
		
		int total = 153;
		int reminder;
		int calculated = 0;
		int org = total;
		
		while(total>0) {
			reminder = total%10;
			calculated = calculated + (reminder*reminder*reminder);
			total = total/10;
			
			if(calculated == org) {
				
				System.out.println("it is an Armsrong number"+"" +calculated);
			}
			else 
			{
				System.out.println("it is not an Armsrong "+"" +calculated);
			}

	}

}
}