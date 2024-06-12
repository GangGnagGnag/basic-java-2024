package ch05.sec05;

public class ReplaceExample {
	public static void main(String[] args) {
		String olda = "동방신이여 영원하라 , 빅뱅보다 나는 동방신기 노래가 더 좋다";
		String newa = olda.replace("빅뱅" , "big bang");
		
		System.out.println("olda");
		System.out.println("newa");
	}

}
