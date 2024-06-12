package ch04.sec06;

import java.util.Scanner;

public class DowhileExample {
	public static void main(String[] args) {
		System.out.print("메시지를 입력하세요");
		System.out.print("프로그램을 종료하려먼 q를 입력하세요")	;
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
		} while( ! inputString.equals("q"));
		
		
			
			
		}
	}


