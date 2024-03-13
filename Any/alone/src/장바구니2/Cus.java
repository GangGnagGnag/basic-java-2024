package 장바구니2;

import java.util.ArrayList;

public class Cus {
    int id;
    String name;
    int age;

    Cus(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    ArrayList<Pro> bag = new ArrayList<>();

    void addToCart(Pro pd, int ct){
        if (pd.qut >= ct){
            bag.add(new Pro (pd.num, pd.name, pd.price, ct));
            pd.qut -= ct;
            System.out.println("구매성공");
            }
        else {
            System.out.println(name + "님은 구매가 불가능 합니다");
        }
    }
    void CusInfo(){
        String human = "회원 번호: " + id + "\n회원 이름: " + name + "\n회원 나이: " + age;
        System.out.println(human + " \n등록완료");
    }

    void buy(){
        for (Pro pd : bag) {
            System.out.println(name + "님이 " + pd.name + "을 " + pd.qut + "개 를 구매 하였습니다" );
            System.out.println("총 가격은 " + pd.price*pd.qut + "입니다");
        }
    }
}
