package ch08.sec08;

public class MultiInterfaceImplExample {
	public static void main(String[] args) {
//		RemoteControl 인터페이스 변수 선언 및 구현 객체 대입
		RemoteControl rc = new SmartTelevision();
		
		rc.turnOn();
		rc.turnOff();
		
		Searchable sv = new SmartTelevision();
		
		sv.search("http://www.youtube.com");
	}

}
