package ch05.sec05;

public class SplitExample {
	public static void main(String[] args) {
		
		String a = "1,자바 학습,참조 타입 String을 학습합니다.,장갱호";
		
		String[] b = a.split(",");
		
		System.out.println("번호: " + b[0]);
		System.out.println("제목: " + b[1]);
		System.out.println("내용: " + b[2]);
		System.out.println("성명: " + b[3]);
		System.out.println();
		
		for(int i = 0; i<b.length; i++) {
			System.out.println(b[i]);
			
		}
		
		
		
	}

}
