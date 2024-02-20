package ch14.sec07.exam03;

public class PrintThread extends Thread {
    public void run() {
        while(true) {
            System.out.println("실행 중 이노");
            if(Thread.interrupted()) {
                break;
            }
        }
        System.out.println("리소스 정리 하노");
        System.out.println("실행 종료 하노");
    }
}
