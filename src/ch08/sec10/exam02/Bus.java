package ch08.sec10.exam02;

public class Bus implements Vehicle	{
//	추상 메소드 재정의
	@Override
	public void run() {
		System.out.println("버스가 부릉 하고 달리노");
	}
	
//	추가 메소드
	public void checkFare() {
		System.out.println("승차 요금을 체크 하노");
		
	}
}
