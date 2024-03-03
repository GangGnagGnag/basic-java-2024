package override;

public class ElectricCar extends Car {
    // Car 안에 있는 move를 그대로 물려받아서 따로 작성해줄 필요가 없음

    @Override
    public void move() {
        System.out.println("전기차가 빠르게 달립니다.");
    }
    public void charge(){
        System.out.println("충전합니다");
    }
}
