package extends1.ex3;

public class ElectricCar extends Car {
    // Car 안에 있는 move를 그대로 물려받아서 따로 작성해줄 필요가 없음
    public void charge(){
        System.out.println("충전합니다");
    }
}
