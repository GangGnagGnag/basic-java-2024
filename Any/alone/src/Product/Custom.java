package Product;

import java.sql.Array;
import java.util.ArrayList;

public class Custom {
    int id;     //회원 번호
    String name;        // 회원 이름
    int age;        //회원 나이

    Product[] bag = new Product[10]; // 장바구니 생성
    int basket = 0;


    //  생성자를 만들어서
    Custom(int id, String name, int age, Product[] bag) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.bag = bag;
    }

    void addToCart(Product pd, int ct){
        
      if(pd.count >= ct) {
          bag[basket] = new Product(pd.number, pd.name, pd.price, ct);
          pd.count -= ct;   // 재고에서 장바구니에 담은 수량만큼 뺌
          System.out.printf("상품이름: %s, 담은 수량: %d, 재고: %d", pd.name, ct, pd.count);
          basket++; // 물건을 담을때마다 장바구니 를 1씩 증가시킨다.
          System.out.println("구매 성공");
      }
      else {
          System.out.println("구매가 불가능 합니다.");
      }

    }

    void CustomInfo(){   // Info 를 사용해서 메서드를 생성하여 메인 클래스에서 Info 를 불러 값을 호출
        String human = "회원 번호: " + id + "이름: " + name + "나이: " + age;
        human += " 회원 생성";
        System.out.println(human);
    }

    public void buy(){
        for(int i=0; i<bag.length; i++){    //for문을 이용하여서 물품을 담음.
            if(bag[i] != null){ // 예외처리
                System.out.println(name+ "님이 " + bag[i].name + "을 " + bag[i].count + "개 구매하였습니다 \n"
                        //                bag 안에 i 갯수 만큼이 들어가있기 때문에 bag[i] 를 사용해야한다.
                        + "총 금액은: " +  bag[i].price*bag[i].count + " 입니다");
                                        // 장바구니 안에 담은 수량 만큼 가격을 곱해줘야하기때문에
            }
        }
    }
}
