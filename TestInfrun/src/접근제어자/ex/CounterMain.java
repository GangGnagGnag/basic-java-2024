package 접근제어자.ex;

public class CounterMain {
    public static void main(String[] args) {
        MaxCounter mx = new MaxCounter(3);
        mx.increment();
        mx.increment();
        mx.increment();
        mx.increment();
        int count = mx.getCount();
        System.out.println(count);
    }
}
