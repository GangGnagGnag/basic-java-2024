package ch05.sec05;

public class LengthExample {
	public static void main(String[] args) {
		String a = "1234561312131";
		int length = a.length();
	
		if(length == 13) {
			System.out.println("13자리 맞농");
		} else {
			System.out.println("뭐 하나 잘못됬다 확인해라");
			
		}
	}

}
