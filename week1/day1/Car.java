package week1.day1;

public class Car {
	
public void driveCar (){
	
	System.out.println("first method - drive car");
}
 public void applyBrake() {
	System.out.println("applied brake");
}

public static void main(String[] args) {
	Car myCar = new Car();
	myCar.driveCar();
	myCar.applyBrake();
	
}
}
