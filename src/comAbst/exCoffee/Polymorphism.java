package comAbst.exCoffee;

class Coffee {
    int price;
    String name;

}

class Americano extends Coffee{
    Americano() {
        this.price = 5000;
        this.name = "아메리카노";
    }
}

class Hazelnut extends Coffee{
    Hazelnut() {
        this.price = 5500;
        this.name = "헤이즐넛";
    }
}
class Cafelatte extends Coffee{
    Cafelatte() {
        this.price = 7500;
        this.name = "카페라떼";
    }
}

class Customer extends Coffee {

    int money = 300000;

    void buyCoffee(Coffee coffee){
        if (money < coffee.price){
            System.out.println("잔액이 부족하여 구매가 불가능 합니다.");
            return;
        }
        money -= coffee.price;
        System.out.printf("%s 를 구입 하셨습니다 \n" ,coffee.name );
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.buyCoffee(new Americano());
        
        c.buyCoffee(new Hazelnut());
        c.buyCoffee(new Cafelatte());

        System.out.println("커피를 구매하고 남은 금액은 " + c.money + "입니다");

    }
}
