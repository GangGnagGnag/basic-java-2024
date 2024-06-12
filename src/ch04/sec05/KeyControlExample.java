package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("-----");
			System.out.println("1, 증속 | 2. 감속 | 중지");
			System.out.println("-----");
			System.out.print("선택: ");
			
			String a = sc.nextLine();
			
			if(a.equals("1")) {
				speed++;
				System.out.println("현재속도= " + speed);
			} else if(a.equals("2")) {
				speed--;
				System.out.println("현재속도= " + speed);
			} else if(a.equals("3")) {
//				run = false;
				break;				// 위 false 랑 동일한 기눙
				
			}
		}
		
		System.out.println("프로그램을 종료합니다");
	}
}


