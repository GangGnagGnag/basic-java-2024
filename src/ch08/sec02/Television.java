package ch08.sec02;

public class Television implements RemoteControl {
	@Override
	public void turnOn() {		//추상 메소드 재정의
		System.out.println("TV를 켜노");
	}
}
