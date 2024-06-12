package ch08.sec11.exam01;

public class KumhoTire implements Tire {
	//	추상 메소드 재정의
	@Override
	public void roll() {
		System.out.println("큼호타이어가 굴러가농");
	}
}
