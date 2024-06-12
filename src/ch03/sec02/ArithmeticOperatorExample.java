package ch03.sec02;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		byte v1 = 10;
		byte v2 = 5;
		int v3 = 3;
		long v4 = 10L;
		
		int result1 = v1 + v2;		//int 타입으로 자동 변환후 연산
		System.out.println("result1: " + result1);
		
		long result2 = v1 + v2 - v4;		// long 타입으로 자동 변환후 연산
		System.out.println("result2: "+ result2);
//		long 타입을 강제로 변환할 경우 데이터 손실 우려	
	
		double result3 = (double) v1 / v2;		// double 타입으로 강제 변환 후 자동연산
		System.out.println("result3: " + result3);
		
		int result4 = v1 % v2;		//나머지 연산 
		System.out.println("result4: " + result4);
		
		
	}

}
