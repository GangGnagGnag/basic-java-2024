package ch14.sec07.exam02;

public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread();
        thread.start();

        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e) {
        }

        thread.interrupt();
    }
}
