package ch08.sec10.exam02;

public class CastingExmaple {
	public static void main(String[] args) {
//		인터페이스 변수 선언과 구현 객체 대입
		Vehicle vc = new Bus();
		
//		인터페이스를 통해서 호출
		vc.run();
		
//		강제 타입 변환 후 호출
		Bus b = (Bus) vc;
		b.run();
		b.checkFare();
	}

}
