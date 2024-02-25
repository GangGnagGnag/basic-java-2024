package 접근제어자.ex;

public class MaxCounter {
//    속성을 다 숨김
    private int count = 0;
    private int max;

//    생성자
    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
//        검증 로직
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다");
            return;
        }
            count++;
    }

    public int getCount() {
        return count;
    }
}
