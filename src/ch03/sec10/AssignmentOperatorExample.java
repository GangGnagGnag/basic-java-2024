package ch03.sec10;

public class AssignmentOperatorExample {
	public static void main(String[] args) {
		int result = 0;
		result += 10;		//result = result + 10
		System.out.println("result=" + result);
		result -= 5;		//result = result -5
		System.out.println("result=" + result);
		result *= 3;		//result = result *3
		System.out.println("result=" + result);
		result /= 5;		//result = result /5
		System.out.println("result=" + result);
		result %= 3;		//result = result %3
		System.out.println("result=" + result);
		
		int result1 = 100;
		int res = 0;
		res = result1 == 100 ? 1 : 0 ; 
//		res는 저장값  resutl1 == 100이 조건값 참이면 1이고 거짓이면 0이 나옴
//		result1 은 100 이 참이 되므로 res 의 값은 1이 나옴

		System.out.println("res의 값은:" + res);
		
	}
}
