package ch06.sec11.exam01;

public class KoreanExample {
	public static void main(String[] args) {
//		객체 생성시 주민등록 번호와 이름 전달
		Korean k1 = new Korean("123456-1234567","갱스터");
		
//		필드값 읽기
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
//		final 필드는 값을 변경할 수 없음
//		k1.nation = "usa";
//		k1.name = "123123123";
		
//		비 final 필드값은 변경 가능
		k1.name = "갱스터";
		
		
		System.out.println(k1.toString());
		
	}

}
