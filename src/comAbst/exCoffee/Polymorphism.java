package comAbst.exCoffee;

class Coffee {
    int price;
    String name;

    Coffee(int price){
        this.price = price;
    }
}

class Americano extends Coffee{
    Americano(){
        super(5000);
    }
    @Override
    public String toString(){
        return "아메리카노";
    }
}

class Hazelnut extends Coffee{
    Hazelnut() {
      super(5500);
    }
    @Override
    public String toString(){
        return "헤이즐넛";
    }
}
class Cafelatte extends Coffee {
    Cafelatte() {
        super(7500);
    }
    @Override
    public String toString(){
        return "카페라떼는";
    }
}
    class CustomerCoffee {

    int money = 300000;

    void buyCoffee(Coffee coffee){
        if (money < coffee.price){
            System.out.println("잔액이 부족하여 구매가 불가능 합니다.");
            return;
        }
        money -= coffee.price;
        System.out.printf("%s 를 구입 하셨습니다 \n" ,coffee);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        CustomerCoffee c = new CustomerCoffee();
        c.buyCoffee(new Americano());
        
        c.buyCoffee(new Hazelnut());
        c.buyCoffee(new Cafelatte());

        System.out.println("커피를 구매하고 남은 금액은 " + c.money + "입니다");

    }
}
