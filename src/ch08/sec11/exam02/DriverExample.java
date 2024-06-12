package ch08.sec11.exam02;

public class DriverExample {
	public static void main(String[] args) {
//		Driver 객체 생성
		Driver dv = new Driver();
		
//		Vehicle 구현 객체 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
//		매게값으로 구현 객체 대입(다향성: 실행 결과가 다름)	\
		dv.drive(bus);
		dv.drive(taxi);

	}

}
