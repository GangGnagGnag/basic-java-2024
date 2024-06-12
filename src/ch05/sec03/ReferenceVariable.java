package ch05.sec03;

public class ReferenceVariable {
	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] arr3;
//		int arr[] 이렇게 와도 
//		arr 이라는 배열 번수 선언
//		배열은 연속적으로 나열하는데 같은 타입으로 가능
		
		arr1 = new int[] { 1, 2, 3};  // heap 영역에 새로운 객체를 저장해라
		arr2 = new int[] { 1, 2, 3};
//		배열 123을 생성하고 arr변수에 대입
		arr3 = arr2;	
//		2의 값을 3에 대입
		
		System.out.println(arr1==arr2);		//같은지 검사 - 저장하고있는 객체가 다르기때문에 false
		System.out.println(arr2==arr3);		//같은지 검사	
		System.out.println(arr1!=arr3);		//다른지 검사
		
	}

}
