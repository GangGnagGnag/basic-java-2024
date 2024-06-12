package ch07.sec03.exam02;

public class SmartPhoneExample {
	public static void main(String[] args) {
//		스마트폰 객체 생성
		SmartPhone myPhone = new SmartPhone("아이폰", "퍼시픽블루");
		
//		폰으로부터  상속받은 필드 읽기
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);

	}
}
