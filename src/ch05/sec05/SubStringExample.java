package ch05.sec05;

public class SubStringExample {
	public static void main(String[] args) {
		String a = "23987459-97812465";
		
		String fN = a.substring(0,7);	//시작은 0번부터지만 7번 앞까지 만 값을 나타냄
		System.out.println(fN);
		
		String sN = a.substring(10);
		System.out.println(sN);
		
	}

}
