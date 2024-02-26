package extends1.ex2;

public class GasCar extends Car{
    // Car 안에 있는 move를 그대로 물려받아서 따로 작성해줄 필요가 없음
    public void fillup() {
        System.out.println("기름을 주유합니다");
    }
}
