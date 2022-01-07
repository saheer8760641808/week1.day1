package week1.day1;

public class Mobile {
public void makeCall() 
{
	System.out.println("first method - call connected");

}
public void sendMsg() 
{
	System.out.println("second method - mesage sent");
}
public static void main(String[] args) {
	Mobile mob = new Mobile();
	mob.makeCall();
	mob.sendMsg();
	
}
}
