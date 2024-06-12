package ch04.sec04;

public class SunFromTo100Example {
	public static void main(String[] args) {
		int sum = 0;
//		누적 시키는 변수는 반드시 0으로 초기화 시켜줘야한다.
		int i;
		
		for(i=1; i <=100; i ++) {
			sum += i;
			
			System.out.println("1~" + (i-1) + "합: " + sum);
		}
	}

}