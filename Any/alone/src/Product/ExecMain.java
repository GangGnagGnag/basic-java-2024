package Product;

public class ExecMain {
    public static void main(String[] args) {
        Custom c1 = new Custom(001,"한국진",29,new Product[10]);
        Custom c2 = new Custom(002,"임경세",28,new Product[10]);
        Custom c3 = new Custom(003,"허재혁",29,new Product[10]);
//        new 연산자로 c1,2,3 이라는 객체를 생성한 후에 Info 의 값을 통해 Custom 안에 들어있는 매게변수의 값을 출력
//        1인당 최대 물품을 10개까지 담을수 있음

        System.out.println("-----------------------------------------------------------------------------------------");
        c1.CustomInfo();   
        System.out.println();
        c2.CustomInfo();
        System.out.println();
        c3.CustomInfo();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");


        Product p1 = new Product(001,"바나나킥",1500, 100);
        Product p2 = new Product(002,"먹태깡",2000, 100);
        Product p3 = new Product(003,"차카니",1000, 100);
        Product p4 = new Product(004,"브라우니",2000, 100);
//        new 연산자로 p1,2,3,4 이라는 객체를 생성한 후에 Info 의 값을 통해 Product 안에 들어있는 매게변수의 값을 출력

        System.out.println();
        p1.ProductInfo();
        System.out.println();
        p2.ProductInfo();
        System.out.println();
        p3.ProductInfo();
        System.out.println();
        p4.ProductInfo();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");


        c1.addToCart(p1, 10);
        System.out.println("-----------------------------------------------------------------------------------------");
        c1.buy();

    }
}
