package ch05.sec05;
// if 문
public class CharAtexample2 {
	public static void main(String[] args) {
		String a = "9610021929402";
		char sex = a.charAt(6);
		
		if(sex == '1') {
			System.out.println("나는야 사나이");
		}else if(sex == '3') {
			System.out.println("나는야 사나이");
		}else {
			System.out.println("나는야 가스나");
			
			/*if(sex == '2') {
			System.out.println("나는야 가스나");
		}else if(sex == '4') {
			System.out.println("나는야 가스나");*/
		}
	}
}

