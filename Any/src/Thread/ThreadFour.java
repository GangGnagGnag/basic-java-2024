package Thread;

public class ThreadFour implements Runnable {

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
        for(int i = 0; i <= 10; i++) {
            ThreadFour th = new ThreadFour();
            Thread tc = new Thread(th);
            tc.start();
            try {
                tc.join();
            } catch (InterruptedException e)  {
                e.printStackTrace();
            }
        }
    }
}


