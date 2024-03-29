package comAbst.ex2Car;

public abstract class Car {
    public abstract void drive();   // 추상메서드 - 몸체가 없다.
    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }
    public void stopCar(){
        System.out.println("시동을 끕니다.");
    }
    final public void run(){
        startCar();
        drive();
        stop();
        stopCar();
    }
}

class ManualCar extends Car {
    @Override
    public void drive() {
        System.out.println("사람이 운전을 합니다.");
    }

    @Override
    public void stop() {
        System.out.println("사람이 시동을 끕니다");
    }
}

class AiCar extends Car{

    @Override
    public void drive() {
        System.out.println("자율주행을 시작합니다");
    }

    @Override
    public void stop() {
        System.out.println("자율주행을 종료합니다");
    }
}