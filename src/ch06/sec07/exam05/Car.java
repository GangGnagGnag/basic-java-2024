package ch06.sec07.exam05;

public class Car {
	// 필드선언
	String company = "현기차";
	String model;
	String color;
	int maxSpeed;
	
	Car(String model) {
//		20라인 생성자 호출	
		this(model,"금색",250);
	}
	
	Car(String model,String color){
//		20라인 생성자 호출
		this(model, color,250);
	}

	Car(String model,String color,int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
