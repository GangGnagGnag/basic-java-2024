package ch02.sec01;

public class VariableExchangeExample {
	public static void main(String[] args) { // 함수머리
		int x = 3; //변수초기화
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y" + y);
		
		// 함수 몸체
	} // 메인이라는 함수가 중괄호 안에 들어와야함.
}

// 전체를 함수의 정의라고 함.