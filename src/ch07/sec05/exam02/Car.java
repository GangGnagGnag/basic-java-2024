package ch07.sec05.exam02;

public class Car {
//	필드선언
	public int speed;
//	메소드 선언
	public void speedUp() {
		speed += 1;
		
	}
//	fianl 메소드 
	public final void stop() {
		System.out.println("차를 멈춥니다");
		speed = 0;
	}
}
