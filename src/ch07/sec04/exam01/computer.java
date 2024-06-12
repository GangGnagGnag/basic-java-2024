package ch07.sec04.exam01;

public class  computer extends Calculator{
//	메소드 오버라이딩
	@Override		// 오버라이딩 된 표시를 알려주는것 
//						컴파일러가 알아서 참조해서 함 , 생략가능하지만 일반적으로 붙여주는게 좋음
	public double areaCircle(double r) {
		System.out.println("computer  객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
