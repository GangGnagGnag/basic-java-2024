package ch05.sec07;

public class MultidimeansionalArrybyValieListExample {
	public static void main(String[] args) {
		
		//2 차원 배열생성
		int[][] a = {{78,20,69} , {40,98,60}};
//					첫 번째 행 		두 번째 행
		
		//배열의 길이
		System.out.println("1차원 배열 길이(반의 수):" + a.length);
		System.out.println("2차원 배열 길이(첫 번째 반의 학생 수" + a[0].length);
		System.out.println("2차원 배열 길이(두 번째 반의 학생 수" + a[1].length);
		
		//첫 번째 반의 세번째 학생의 점수 읽기
		System.out.print("a[0][2]: " + a[0][2]);
		
		//두 번째 반의 두 번째 학생의 점수 읽기
		System.out.println("a[1][1]: " + a[1][1]);
		
		//첫 번째 반의 평균 점수 구하기
		int class1Sum = 0;
		for(int i =0; i<a[0].length; i++) {
			class1Sum += a[0][i];
		}
		double class1Avg = (double) class1Sum / a[0].length;
		System.out.println("첫 반째 반의; 평균 점수: " + class1Avg);
		
		//두 번째 반의 평균 점수 구하기
		int class2Sum = 0;
		for(int i = 0; i<a[1].length; i++) {
			class2Sum += a[1][i];
		}
		double class2Avg = (double) class2Sum / a[1].length;
		System.out.println("두 반째 반의; 평균 점수: " + class2Avg);
		
		//전채 학생의 평균 점수 구하기  이중 for 을 써야함
		
		int totalStudent = 0;
		int totalSum = 0;
		for(int i=0; i<a.length; i++) {						//반의 수 만큼 반복
			totalStudent += a[i].length;					//반의 학생 수 합산
			for(int k = 0; k<a.length; k++) {				//해당 반의 학생 수만큼 반복
				totalSum += a[i][k];						//학생 점수 합산
			}
		}
//		2차원 배열은 각 행의 숫자를 다르게 써도 배열할 수 있다.
		double totalAvg = (double) totalSum / totalStudent;
		System.out.printf("전체 학생의 평균 점수:%.2f ", totalAvg);
		}
	}
