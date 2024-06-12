package ch03.sec08;

public class BitLogicExample {
	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25)); // 이진수로 나타낼때 둘다 참이어야 참
		System.out.println("45 | 25 = " + (45 | 25));	//  하나라도 참이면 참
		System.out.println("45 ^ 25 = " + (45 ^ 25));	// 하는 0 이고 하나는 1일때 참
		System.out.println("~45 = " + (~45));
		
		byte reciveData = -120;
		
//		방법1: 비트 논리곱 연산으로 Unsigend 정수 얻기
		int unsinedInt1 = reciveData & 255;
		System.out.println(unsinedInt1);
				
//		방법2: 자바 API를 이용해서 Unsigend 정수 얻기
//		API는 함수집합체
		int unsinedInt2 = Byte.toUnsignedInt(reciveData);
		System.out.println(unsinedInt2);
		
		int test = 136;
		byte btest = (byte) test;
		System.out.println(btest);
		
		
	}

}
