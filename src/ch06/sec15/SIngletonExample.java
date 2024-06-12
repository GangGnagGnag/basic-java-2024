package ch06.sec15;

public class SIngletonExample {
	public static void main(String[] args) {
		
//		Singleton obj1= new Singleton();
//		Singleton obj2= new Singleton();
//		위 같은 경우 getter 메서드를 사용 하지 않아서 컴파일 에러가 남.
		
//		정적 메소드를 호출해서 싱글톤 객체를 얻음
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
//		 미리 만들어진 객체에 참조해서 사용할 수 있다.

		
//		동일한 객체를 잠조하는지 확인
		if(obj1 == obj2) {
		System.out.println("같은 Singleton 객체 입니다");
		} else {
		System.out.println("다른 Singleton 객체 입니다");
		}
	}
}
