package ch06.sec11.exam02;

public class Earth {
	
//	상수 선언 초기화
	static final double EARTH_RADIUS = 6400;
	
//	상수선언
	static final double EARTH_SURFACE_AREA;		//상수이름은 모두 대문자로 사용 하고 다른언어가 조합된다면 _ 를 붙이기
	
//	정적 블록에서 상수 초기화
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI*EARTH_RADIUS*EARTH_RADIUS;
//								Math PI는 자바에서 제공하는 상수이다.
	}

}
