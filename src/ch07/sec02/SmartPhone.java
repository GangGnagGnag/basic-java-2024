package ch07.sec02;

public class SmartPhone extends Phone {
	
// 필드선언
	 public boolean wifi;
	 
	 SmartPhone(){
		 System.out.println("나는 SmartPhone (자식) 생성자 입니다");
	 }
	 
//	 생성자 선언(두개의 입력을 가지는 생성자)
	 public SmartPhone(String model, String color) {
		 this.model = model;
		 this.color = color;
		
	 }
	 
//	 메소드 선언
	 public void setWifi(boolean Wifi) {
		 this.wifi = Wifi;
		 System.out.println("와이파이 상태를 변경했습니다");
	 }
	 
	 public void internet() {
		 System.out.println("인터넷을 연결합니다");
	 }
	 void price() {
		 System.out.println("나는 디폴트 생성자 입니다");
	 }
}
