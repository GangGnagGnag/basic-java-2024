package Thread;

public class ThreadThree extends Thread {

    @Override
    public void run() {
        System.out.println(getName() + "국진이가 랩을한다 홍 홍 홍");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(getName() + "갱스터가 랩을한다 홍 홍 홍");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread t = new ThreadThree();
            t.start();
            try {
                t.join();                             // join이 없는 경우에는 스레드는 실행 시키면 실행 순서는 우리가 알 수 없음.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


