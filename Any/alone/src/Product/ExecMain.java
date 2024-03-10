package Product;

public class ExecMain {
    public static void main(String[] args) {
        Custom c1 = new Custom(1,"한국진",29);
        Custom c2 = new Custom(2,"임경세",28);
        Custom c3 = new Custom(3,"허재혁",29);
//        new 연산자로 c1,2,3 이라는 객체를 생성한 후에 Info 의 값을 통해 Custom 안에 들어있는 매게변수의 값을 출력

        System.out.println("-----------------------------------------------------------------------------------------");
        c1.CustomInfo();   
        System.out.println();
        c2.CustomInfo();
        System.out.println();
        c3.CustomInfo();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");


        Product p1 = new Product(1,"바나나킥",1500, 500);
        Product p2 = new Product(2,"먹태깡",2000, 500);
        Product p3 = new Product(3,"차카니",1000, 500);
        Product p4 = new Product(4,"브라우니",2000, 500);
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
    }
}
