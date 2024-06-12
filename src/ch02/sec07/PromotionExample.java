package ch02.sec07;

public class PromotionExample {
	public static void main(String[] args) {
		//자동 타입 변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue:" + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드:"+ intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue:" + longValue);
		
		longValue = 100;
		float floatvalue = longValue;
		System.out.println("floatValue:" + floatvalue);
		
		floatvalue = 100.5F; //비교 하기위해서 실수는F 로 해놓음 , 정수는L 로 해놓음
		double doubleValue = floatvalue;
		System.out.println("doubleValue:" + doubleValue);
	}

}
