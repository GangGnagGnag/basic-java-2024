package ch14.sec08;

import ch09.sec02.exam02.A;

public class DaemonExample {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        System.out.println("메인 스레드 종료 하노");

    }
}
