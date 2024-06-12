package ch06.sec10.exam03;

public class Car {
//	인스턴스 필드 선언
	int speed;
	
//	인스턴스 메소드 선언
	void run(){				
		System.out.println(speed + "으로 달립니다");
	}

	static void simulate() {//객체를 생성해야 사용이 가능함으로 메소드를 선언해 주어야한다.
//		객체생성
		Car myCar = new Car();
//		인스턴스 맴버 사용
		myCar.speed = 200;
		myCar.run();
	}
	
	public static void main(String[]args) {
//		정적 메소드 호출
		simulate();
		
//		객체 생성 
		Car myCar = new Car();
//		인스턴스 맴버 사용
		myCar.speed = 60;
		myCar.run();
	}
}
