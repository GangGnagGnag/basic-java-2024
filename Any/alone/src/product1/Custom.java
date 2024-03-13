package product1;

import java.util.ArrayList;

public class Custom {
    int id;         // 회원번호
    String name;    // 회원 이름
    int age;        // 회원 나이

    ArrayList <Product>bag = new ArrayList<>();

    Custom(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void addToCart(Product pd, int ct) {
        if (pd.count >= ct) {
            bag.add(new Product(pd.num, pd.name, pd.price, ct));
            pd.count -= ct; // 재고에서 장바구니에 담은 수량만큼 뺌
            System.out.printf("상품이름: %s, 담은 수량: %d, 재고: %d\n", pd.name, ct, pd.count);
            System.out.println("구매 성공");
        } else {
            System.out.println("구매가 불가능 합니다.");
        }
    }

    void CustomInfo() {
        String human = "회원번호 " + id + "이름 " + name + "나이 " + age;
        human += "회원생성";
        System.out.println(human);
    }

    public void buy() {
        for (Product product : bag) { // 향상된 for문을 사용하여 ArrayList를 순회합니다.
            System.out.println(name + "님이 " + product.name + "을 " + product.count + "개 구매하였습니다 \n"
                    + "총 금액은: " + product.price * product.count + " 입니다");
        }
    }
}
