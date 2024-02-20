package Thread;

class MyClass {
    private int count;

    public synchronized void increment() {          //메소드 동기화 ; 하나의 값이 실행 되는 동안에 다른 값이 count에 접근하지 못하게 동기화를 시킴.
        count++;
    }
    public synchronized void decrement() {
        count--;
    }
    public void getCount(){
        System.out.println("count: " + count);
    }
}

public class ThreadFive {
    public static void main(String[] args) {
        MyClass myclass = new MyClass();                //인스턴스는 객체를 생성할 수 없기 때문에 메소드 값을 사용할수 있는 객체를 생성해줘야함.

//        스레드를 만들지 않으면 메인에 있는 스레드만 사용하기 때문에 만들어줌
        Thread th = new Thread(new Runnable() {             //익명구현객체를 만들어야 하기 때문에 {} 사용 하고 Runnable에 대한 재정의를 해줘야함.
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    myclass.increment();                    
                }
            }
        });
        Thread thi = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++){
                    myclass.decrement();
                }
            }
        });

        thi.start();
        th.start();

        try {
            th.join();
            thi.join();
        } catch (InterruptedException e ) {
            e.printStackTrace();
        }
        myclass.getCount();
        System.out.println();
    }
}

