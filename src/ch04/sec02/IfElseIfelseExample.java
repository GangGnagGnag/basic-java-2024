package ch04.sec02;

public class IfElseIfelseExample {
	public static void main(String[] args) {
		int score = 85;
		
		if(score >= 90) {
			System.out.println("점수가 90점 보다 큽니다.");
			System.out.println("등급은 A 입니다");
		}
		else if(score >= 80) {
			System.out.println("점수가 90보다 작고 80보다 큽니다.");
			System.out.println("등급은 B입니다.");
		}
		else if(score >= 70) {
			System.out.println("점수가 80보다 작고 70보다 큽니다.");
			System.out.println("등급은 C입니다.");
		}
		else if(score >= 60) {
			System.out.println("점수가 70보다 작고 60보다 큽니다.");
			System.out.println("등급은 D입니다");
		}
		else {
			System.out.println("당신은 그냥 F 입니다.");
			
//			어디에도 들어가는 조건이 없으면 마지막그 밖에 다 묶으면 됨
			
		}
	}

}

