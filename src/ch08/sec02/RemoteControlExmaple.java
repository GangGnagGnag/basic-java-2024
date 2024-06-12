package ch08.sec02;

public class RemoteControlExmaple {
	public static void main(String[] args) {
		RemoteControl rc;			//인터페이스 값에 구현 값만 저장가능.
		
//		rc 변수에 텔레비젼 객체를 대입
		rc = new Television();
		rc.turnOn();
		
//		rc 변수에 오지도 객체를 대입(교체시킴)
		rc = new Audio();
		rc.turnOn();
	}
}
