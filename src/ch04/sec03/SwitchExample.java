package ch04.sec03;

public class SwitchExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		
		switch(num) {		//스위치문 뒤에 변수 넣어주고 실행
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:		//위에있는 케이스의 경우가 아닌경우에 가능
//		있어도 되고 없어도됨.
			System.out.println("6번이 나왔습니다.");
	
		}
	}

}
