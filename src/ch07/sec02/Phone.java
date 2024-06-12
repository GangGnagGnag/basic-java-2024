package ch07.sec02;

public class Phone {

//	필드 선언
	public String model;
	public String color;
//	디폴트 생성자
	Phone (){
		System.out.println("나는 phone(부모)생성자 입니다");
	}
	
//	매소드 선언
	public void bell() {
		System.out.println("벨이울리농");
	}
	
	public void sendVoice(String message) {
	System.out.println("자기: " + message);
	}
	
	public void reciveVoice(String message) {
		System.out.println("상대방: " + message);
	}
	public void hangup() {
		System.out.println("전화를 끊습니다");
	}
	
}
