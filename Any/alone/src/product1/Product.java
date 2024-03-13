package product1;

public class Product {
    int num;    // 물품번호
    String name;    // 물품 이름
    int price;      // 물품 가격
    int count;      // 물품 갯수

    Product(int num, String name, int price, int count){
        this.num = num;
        this.name = name;
        this.price = price;
        this.count = count;

    }

    void ProductInfo(){
        String mart = "물품 번호 " + num + "물품 이름 " + name + "물품 가격 " + price + "물품 갯수 " + count;
        mart += "물품등록완료";
        System.out.println(mart);
    }
}
