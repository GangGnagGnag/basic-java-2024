package 장바구니;

import java.util.ArrayList;

public class Cus {
    public int id;     //회원 번호
    public String name;        // 이름
    public int age;        // 나이

    ArrayList<Pro> bag = new ArrayList<>();

    Cus(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void addToCart(Pro pd, int count) {
        if (pd.qut >= count) {
            bag.add(new Pro(pd.num, pd.name, pd.price, count));
            pd.qut -= count;
            System.out.println("상품이름 " + pd.name + "\n담은 수량 " + count + "개 남은재고 " + pd.qut + "개");
            System.out.println("구매 성공");
        } else {
            System.out.println(name + "님은 구매가 불가능 합니다");
        }
    }

    void CusInfo() {
        String ct = "회원번호 " + id + "이름 " + name + "나이 " + age;
        System.out.println(ct);
    }

    public void buy() {
        for (Pro pro : bag) {
            System.out.println(name + "님이 " + pro.name + "을 " + pro.qut + "개 구매하엿습니다");
            System.out.println("총 가격은 " + pro.price*pro.qut + "입니다.");
        }
    }
}

