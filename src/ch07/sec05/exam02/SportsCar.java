package ch07.sec05.exam02;

public class SportsCar extends Car	{
//	@Override
	public void speedUp() {
		speed += 10;
	}
	
//	@Override		오버라이딩 할 수 없음
/*	public void stop() {
		System.out.println("스포츠카를 멈춥니다");
		speed = 0; 
	} */
}
