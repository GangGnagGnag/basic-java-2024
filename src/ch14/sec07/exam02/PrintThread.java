package ch14.sec07.exam02;

public class PrintThread extends Thread {
    public void run() {
        try {
            while(true) {
                System.out.println("실행 중 이노");
                Thread.sleep(1); //일시정지를 만들어서 (interruptedException이 발생할 수 있도로)
            }
        } catch(InterruptedException e) {
        }
        System.out.println("리소스 정리하노");
        System.out.println("실행 종료 ");
    }
}

