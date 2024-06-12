
package ch04.sec04;

import java.util.Scanner;

public class MultiplicationTableExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 단을 입력할까요?");
		int a = sc.nextInt();
		
//		for (int m=2; m<=9; m++) {
//			System.out.println("***" + m + "단 ***");
		
		for (int n=1; n<=9; n++ ) {
			System.out.println(a + " x " + n + " = " + (a*n));
			
		}
	}
}
//	}

