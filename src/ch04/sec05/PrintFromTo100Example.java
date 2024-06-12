package ch04.sec05;

public class PrintFromTo100Example {
	public static void main(String[] args) {
		int a = 0;
		
		
		int b = 1;
		
		while(a <= 100) {
			a += b;
			b++;
		}
		System.out.print("1~" + (b-1) + " 합: " + a);
		}
	}
	

