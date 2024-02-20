package Thread;

public class ThreadFour2 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 국진이 스~따뜨업~");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " 국진이 멈춰어어엉");
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            Runnable task = new ThreadFour2();       //1. 구현객체 생성
            Thread t = new Thread(task);            //2. 스레드 객체 생성
//            Thread t = new Thread(new ThreadFour2());  이렇게도 사용가능함 위의 2개를 사용하는걸 하나로 묶어서 만든거
            t.start();
        }
    }
}

// 익명으로 사용하는것은 일회성이 있는 것을 만들때 사용하는것.