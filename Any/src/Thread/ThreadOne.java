package Thread;

public class ThreadOne {
    public static void main(String[] args) {
        Thread tc = Thread.currentThread();     //객체안에있는 currentThread 호출
        System.out.println(tc.getName());       //객체 생성없이 메소드에 접근함 , 클래스 맴버. - 인스턴스맴버이면 객체를 생성해야함
    }
}

// 모든프로그램은 메인 스레드에서 시작함.
