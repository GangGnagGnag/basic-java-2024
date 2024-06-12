package ch03.sec07;

public class Local10peratorExample {
	public static void main(String[] args) { 
		int charCode = 'A';
		
		if( (65<=charCode) & (charCode<=90) ) {	//비트연산 이기때문에 좌항 우항이 해줘야함
			System.out.println("대문자이군요");		//비트연산은 무엇이든 둘다 계산을 해야함
		}
		
		if( (97<=charCode) && (charCode<=122) ) { //두개 다 참이어야하기때문에 거짓
			System.out.println("소문자이군요");			// 논리연산의 경우 좌항이 거짓이면 우항은 계산하지 않음
		}
	
		if( (48<=charCode) && (charCode<=57) ) {
			System.out.println("0~9 숫자이군요");
		}
		
//		-------------------------------------------
		 int value = 6;
	      
	      
	      if( (value%2==0) || (value%3==0) ) {
	         System.out.println("2 또는 3의 배수이군요, ");         
	      }
	      
	      boolean result = (value%2==0) || (value%3==0);
	      if( !result ) {
	         System.out.println("2또는 3의 배수가 아니군요.");
	      }   
	   }
	}