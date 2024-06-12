package ch05.sec10;

public class AdvancedForExample {
public static void main(String[] args) {
//	배열 변수 선언와 배열 생성
	int[] a = {1, 2, 3, 4, 5};
//	배열 항목 값 구하기
	
//	int sum = 0;
//	for(int i=0; i<a.length; i++) {
//		 su
//		
//	System.out.println(
//	
	
	int sum = 0;
	for(int b : a) {
		sum = sum + b;
		
	}
	System.out.println("점수 총합 = " + sum);
//	배열 항목 전체 평균 구하기
	double avg = (double) sum / a.length;
	System.out.println("점수 평균 = " + avg);
	}
}

