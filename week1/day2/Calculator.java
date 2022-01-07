package week1.day2;

import org.apache.poi.util.SystemOutLogger;

public class Calculator {
 
	public int add(int num1, int num2) {
		return num1+num2;
		
 }
	public int sub(int num1,int num2) {
		return num1-num2;
		
	}
	public int mul(int num1,int num2) {
		return num1*num2;
		
	}
	public int  div(int num1,int num2){
		
		return num1/num2;
		
	}
	public static void main(String[] args) {
		
   Calculator calc = new Calculator();
   
   int add = calc.add(5, 20);
   
   int sub = calc.sub(5,10);
   
   int mul = calc.mul(5,10);
   
   int div = calc.div(5,10);
   
  
   System.out.println(add);
   System.out.println(sub);
   System.out.println(mul);
   System.out.println(div);
	}

}
