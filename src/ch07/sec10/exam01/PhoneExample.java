package ch07.sec10.exam01;

public class PhoneExample {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("갱스터");
		
		sp.turnOn();
		sp.internetSearch();			// 타입은 일치 시켜 주는게 원칙이다.
		sp.turnOff();
	}

}

// 상속 목적으로 만들어진게 추상클래스이다.