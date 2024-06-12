package ch07.sec10.exam01;

public class Phone {

//	 필드선언
	String owner;
	
//	생성자 선언
	Phone(String owner){
		this.owner = owner;
	}
	
//	메소드 선언
	void turnOn() {
		System.out.println("폰 전원을 켜노");
	}
	void turnOff() {
		System.out.println("폰 전원을 끄노");
	}
}
