package ch05.sec05;
// switch 문
public class CharAtexample {
	public static void main(String[] args) {
		String a = "9610021748394";
		char sex = a.charAt(6);
		
		switch (sex) {
		case '1','3' -> {
		System.out.println("나는야 사나이");
		break;
		}
		case '2','4' ->{
			System.out.println("나는 여자농");
			break;
		}
		}
	}
}

