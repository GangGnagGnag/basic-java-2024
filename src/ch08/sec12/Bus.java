package ch08.sec12;

public class Bus implements Vehicle	{
	@Override
	public void run() {
		System.out.println("타요 타요 우리모두 타요 버스");
	}

	public void checkFare() {
		System.out.println("삐빅 학생입니다");
	}
}
