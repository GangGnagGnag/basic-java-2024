package ch03.sec06;

public class CompareOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2); 
		// != 같지 않다라는 뜻 , 같거나 다르다 라는 의미 x
		boolean result3 = (num1 <= num2);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);	// 65<66
		System.out.println("result4: "+ result4);
		
		int num3 = 1;
		double num4 = 1.0;		//타입을 같게 해줘야해서 int 형태로 바뀌면 정수형태인 1 이됨
		boolean result5 = (num3 == num4);
		System.out.println("result5: " + result5);
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6	= (num5 == num6); // 실수 비교는 정밀도가 다르기때문에 false 가 나옴
		boolean result7 = (num5 == (float)num6);
		//num6 의double을 float 으로 강제 변환 하기 위해 괄호 사용
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);
	
			// 참조변수 
		String str1 = "자바";
		String str2 = "JAVA";
//		위 str1 과 str2 는 주소값을 저장하고 있기 때문에 다름.
		boolean result8 = (str1.equals(str2));			//string 은 객채이기 때문에 equals를 사용
		boolean result9 = (! str1.equals(str2));		// ! 표시는 다르다 라는 의미를 가짐
		System.out.println("result8: " + result8);
		System.out.println("result9: " + result9);	
		
	}

}
