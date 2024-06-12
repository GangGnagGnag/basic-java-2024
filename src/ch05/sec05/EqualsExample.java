package ch05.sec05;

public class EqualsExample {
	public static void main(String[] args) {
		String a = "";
		String b = "";
		
		if(a == b) {
		System.out.println("값이 같농");
		}else {
			System.out.println("값이 다르농");
		}
		
		if(a.equals(b)) {
			System.out.println("입력한 값이 같농");
		}
		
		String x = new String("GD");
		String y = new String("GD");
		
		if (x == y) {
			System.out.println("GD맞농");
		}
		else {
			System.out.println("GD아니농");
		}
		
		if(x.equals(y)) {
			System.out.println("나 GD 맞농");
		}
	}
}

