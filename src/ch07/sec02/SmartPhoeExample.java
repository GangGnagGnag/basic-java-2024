package ch07.sec02;

public class SmartPhoeExample {
	public static void main(String[] args) {
//		smartphone 객체 생성
//		SmartPhone myPhone = new SmartPhone("아이폰","퍼시픽블루");	
		SmartPhone myPhone = new SmartPhone();
		
//		폰으로 부터 상속받은 필드 읽기
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);
		
//		스마트 폰의 필드 읽기
		System.out.println("와이파이 상태: " + myPhone.wifi);
		
//		폰으로 부터 상속받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.reciveVoice("안녕하세요 저는 장경호 인데요");
		myPhone.sendVoice("아 그래 반갑농~");
		myPhone.hangup();
		
//		smartphone의 메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();

		
	}
}

//	 부모 생성자를 실행 시키고 자식 생성자 실행시킨다.



