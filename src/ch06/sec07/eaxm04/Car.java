package ch06.sec07.eaxm04;

public class Car {
//	필드선언
	
	String company = "RR";
	String model;
	String color;
	int maxSpeed;
	
//	생성자 선언
	Car(){}			// 디폴트 값을 저장하고 있기 때문에 이 값이 없으면 출력이 안됨
	
	Car(String model){
		this.model = model;
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
