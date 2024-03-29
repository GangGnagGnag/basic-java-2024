package comAbst.ex2Car;

import comAbst.ex2Car.AiCar;
import comAbst.ex2Car.Car;
import comAbst.ex2Car.ManualCar;

public class AbstractEx {
    public static void main(String[] args) {
        Car car = new AiCar();  // 다형성 (추상클래스를 사용하는이유)
        car.run();
        car = new ManualCar();
        car.run();

    }
}
