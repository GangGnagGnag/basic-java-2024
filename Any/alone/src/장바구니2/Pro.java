package 장바구니2;

public class Pro {
    int num;
    String name;
    int price;
    int qut;

    Pro(int num, String name, int price, int qut){
        this.num = num;
        this.name = name;
        this.price = price;
        this.qut = qut;
    }

    public void ProInfo(){
        String mart = "물품번호: " + num + "\n물품이름: " + name + "\n물품가격: " + price + "\n물품재고: " + qut;
        System.out.println(mart + " \n등록완료");
    }
}
