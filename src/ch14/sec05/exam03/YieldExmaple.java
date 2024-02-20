package ch14.sec05.exam03;

public class YieldExmaple {
    public static void main(String[] args) {
        WorkThread workThreadA = new WorkThread("종훈이형");
        WorkThread workThreadB = new WorkThread("종훈이형");
        workThreadA.start();
        workThreadB.start();

        try { Thread.sleep(5000); } catch (InterruptedException e) {}
        workThreadA.work = false;

        try { Thread.sleep(10000); } catch (InterruptedException e) {}
        workThreadA.work = false;
    }
}
