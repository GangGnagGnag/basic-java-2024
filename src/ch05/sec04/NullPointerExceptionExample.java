package ch05.sec04;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		int [] intArmy = null;
		intArmy[0] = 10;
		
		String str = null;
		System.out.println("총 문자수:" + str.length() );
		
//		값이 저장되어 있지 않기 때문에 아무것도 나오지 아니함
	}

}
