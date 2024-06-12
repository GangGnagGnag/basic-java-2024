package ch06.sec09;

public class Car {
//		필드선언
	String model;
	int speed;
//	생성자 선언
	 Car(String model){
		 this.model = model;		//매개변수를 필드에 대입
	 }
//	 메소드 선언
	 void setSpeed(int speed) {
		 this.speed = speed;		//매개변수를 필드에 대입
	 }
	 
	 void run() {
		 setSpeed(100);	//this.setSpeed라고 써도됨
		 System.out.println(model + "가 달립니다. (시속" + speed + "km/h)");		
		 //this.model , this.speed 모두다 this 생략가능																		
		 // 여기서는 가능하지만 위에 매개변수를 대입하는 곳에서는 this 생략 불간으
	 }	 
}

