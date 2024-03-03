package extends1.ex3;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillup();
        gasCar.openDoor();

        HyCar hyCar = new HyCar();
        hyCar.move();
        hyCar.fillHy();
        hyCar.openDoor();

    }
}
