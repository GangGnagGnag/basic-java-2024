package ch13.sec02.exam01;

public class GenericExmaple {
    public static void main(String[] args) {
//        K 는 Tv로 대체, M 은 String 으로 대체
        Product<Tv, String> product1 = new Product<>();
        //제네릭 타입이 2개 이기 때문에 한개는 Tv 타입 하나는 String 타입으로 적용

//        Setter 매개값은 반드시 Tv와 String을 제공
        product1.setKind(new Tv());
        product1.setmodel("스마트Tv");

//        Getter 리턴값은 Tv와 String으로 대체
        Tv tv = product1.getKind();
        String tvModel = product1.getModel();
        System.out.println(tvModel);

//        ----------------------------------------

//        K 는 Car 로 대체 M 은 String 으로 대체
        Product<Car, String> product2 = new Product<>();

//        Setter 매게값은 반드시 Car와 String제공
        product2.setKind(new Car());
        product2.setmodel("SUV자동차");

//        Getter 리턴값은 Car와 String이 됨
        Car car = product2.getKind();
        String carModel = product2.getModel();
        System.out.println(carModel);
    }
}
