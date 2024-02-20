package ch13.sec02.exam02;

public class CarAgency implements  Rentable<Car> {      //타입 파라미터를 P Car로 대체
    @Override
    public Car rent() {
        return new Car();           // 리턴 타입이 반스디 Car여야함
    }
}
