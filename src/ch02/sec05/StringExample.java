package ch02.sec05;

public class StringExample {
	public static void main(String[] args) {
		String name = "장경호";
		String job = "개백수";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다";
		System.out.println(str);
		
		str = "번호\t이름\t직업"; // \t 탭 키만큼 띄운다.
		System.out.println(str);
		
		System.out.print("나는\n"); 
		System.out.print("자바를\n"); // ln이 붙게 되면 한 줄을 띄움
		System.out.print("배웁니다.");
		
	}

}
