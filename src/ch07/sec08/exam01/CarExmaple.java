package ch07.sec08.exam01;

public class CarExmaple {
	public static void main(String[] args) {
//		Car 객체 생성
		Car myCar = new Car();
		
//		Tire 객체 생성
		myCar.tire = new Tire();
		myCar.run();
		
//		hankookTire 객체 생성
		myCar.tire = new HankookTire();
		myCar.run();
		
//		kumhoTire 객체 생성
		myCar.tire = new KumhoTire();
		myCar.run();
	}
}

//my.car를 불러오지만 결과 값은 다르게 나온다.
 
