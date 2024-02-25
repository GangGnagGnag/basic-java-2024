package Static2.Ex;

public class Car {
    private static int totalCars;
    private String name;

    public Car(String name) {
        System.out.println("차량구입, 이름은: " + name);
        this.name = name;
        totalCars++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차랑 수: " + totalCars);
    }
}
