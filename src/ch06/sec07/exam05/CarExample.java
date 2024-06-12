package ch06.sec07.exam05;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car("ev9");
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println("car1.color : " + car1.color);
		System.out.println("car1 maxSpeed : " + car1.maxSpeed);
		System.out.println();
		
		Car car2 = new Car("ev9","그린");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : " + car2.color);
		System.out.println();
		
		Car car3 = new Car("ev9","그린",300);
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println("car3.maxspeed : " + car3.maxSpeed);
		System.out.println();
		
		Car car4 = new Car("company : ");
		System.out.println("car4 company" + car4.company);
	}

}
