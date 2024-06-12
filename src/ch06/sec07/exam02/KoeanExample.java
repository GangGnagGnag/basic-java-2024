package ch06.sec07.exam02;

public class KoeanExample {
	public static void main(String[] args) {
//		Korean 객체 생성
		Korean k1 = new Korean("장갱", "917823-2837181");
		System.out.println("k1 nation: " + k1.nation);
		System.out.println("k1 name: " + k1.name);
		System.out.println("k1 ssn: " + k1.ssn);
		System.out.println();
		
//		korean 다른 객체 생성
		Korean k2 = new Korean("국찌", "917202-3818382");
//		다른 객체 데이터 읽기
		System.out.println("k2 nation: " + k2.nation);
		System.out.println("k2 name: " + k2.name);
		System.out.println("k2 ssn: " + k2.ssn);
		System.out.println();
		
//		또 다른 객체
		Korean k3 = new Korean();		
//		디폴트 값이 없기때문에 생성자 선언에서 디폴드값을 만들어ㅏ줘야한다.
	}
}
