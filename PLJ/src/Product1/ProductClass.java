package Product1;

public class ProductClass {
    int id;     // 물품 번호
    String name;    // 물품 이름
    int count;      // 물품 수량
    int price;      // 물품가격

    ProductClass[] shoppingBag; // 물품을 저장할 바구니
    ProductClass(int id, String name, int count,int price) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.price = price;
    }
}
