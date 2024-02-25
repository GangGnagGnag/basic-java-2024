package 접근제어자.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity){

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
    return name;
    }

    public int getTotalPrice(){     //속성과 기능이 근처에 있는걸 쓰느게 좋음.
        return price * quantity;
    }
}

