package ch05.sec09;

public class ArrayCopybyForExample {
	public static void main(String[] args) {
		//길이 3인 배열
		int[] oldIntArry = {1, 2, 3};
		//길이 5인 배열
		int[] newIntArry = new int[5];
		//배열 항목 복사
		for(int i=0; i<oldIntArry.length; i++) {
			newIntArry[i] = oldIntArry[i];
		}
//		arraycopy를 사용해도 됨.
		
		//배열 항목 출력
		for(int i=0; i<newIntArry.length; i++) {
			System.out.print(newIntArry[i] + ", ");		
		}
	}
}
