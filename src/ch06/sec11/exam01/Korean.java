package ch06.sec11.exam01;

public class Korean {		
//	ch06.sec11.exam01.Korean@626b2d4a 클래스 원래이름을 뜻함
// 	패키지에는 클래스가 포함되.

//	인스턴스 final 필드선언
	final String nation = "대한민국";		//nation안에있는 값을 변경 시키지 마라 
	final String ssn;					//변경시키지 말라해했지만 값이 없음(생상자에서 값을 입력해라)
//	메소드에 파이널 키워드가 붙어 있으면 오버로딩 하지 말라 라는 의미임.	
	
//	인스턴스 필드 선언
	String name;
	
//	생성자 선언
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
