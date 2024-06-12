



package ch02.sec01;

public class VariableUseExample {
	public static void main(String[] args) {
		int hour = 3; // int 라는 크기만큼 hour를 할당받음
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		// 함수가 뭔지 알고 입력 값이 어떤건지를 먼저 알아야함.()안에 있는 입력값 확인
		
		System.out.println(hour); // hour라는 변수안에 있는 3을 출력
		System.out.println(3); // 3이라는 정수 출력
		System.out.println("3"); // 3 이라는 문자열 출력
		
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총 " + totalMinute + "분"); // 괄호가 있으면 함수.
	}

}
