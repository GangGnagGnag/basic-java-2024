package ch03.sec05;

public class InfinityAndNANChenckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x / y;
//		double z1 = x % y;
//		System.out.println(z);
//		System.out.println(z1);
		
//		잘못된 코드
		System.out.println(z + 2);
//		알맞은 코드
		
		if(Double.isInfinite(z) || Double.isNaN(z)) { 	
			System.out.println("값 산출 불가");		// 참 이면 "값 산출 불가" 라고나옴
		} else {
			System.out.println(z + 2);				
		}
	}

}
