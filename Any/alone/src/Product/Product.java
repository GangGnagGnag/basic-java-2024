package Product;

import java.nio.file.FileAlreadyExistsException;

public class Product {
    int number;     //물품 번호
    String name;    //물품 이름
    int price;      //물품 가격
    int count;      //물품 수량

//  생성자를 만들어서
    Product(int number, String name, int price, int count){
        //this 객체가 자기자신
        this.number = number;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    void ProductInfo() {    // Info 를 사용해서 메서드를 생성하여 메인 클래스에서 Info 를 불러 값을 호출
        String Mega = "물품번호: " + number + "물품 이름: " + name + "가격: " + price + "물품 수량: " + count;
        Mega += " 물품 등록 완료";
        System.out.println(Mega);
    }
}
