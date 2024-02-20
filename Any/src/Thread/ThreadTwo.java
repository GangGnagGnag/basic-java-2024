package Thread;

public class ThreadTwo extends Thread {
    @Override
    public void run() {
        System.out.println("국진이가 랩을 한다 홍 홍 홍~");
    }

    public static void main(String[] args) {
        ThreadTwo th = new ThreadTwo();
        th.start();
    }
}