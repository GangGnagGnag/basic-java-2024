package 장바구니;

public class Main {
    public static void main(String[] args) {

        Cus c1 = new Cus(1,"한국진",29);
        Cus c2 = new Cus(2,"박창현",28);
        Cus c3 = new Cus(3,"임경세",26);

        System.out.println("--------------------------------");
        c1.CusInfo();
        System.out.println();
        c2.CusInfo();
        System.out.println();
        c3.CusInfo();
        System.out.println();
        System.out.println("--------------------------------");

        Pro p1 = new Pro(1,"감자깡", 1500, 100);
        Pro p2 = new Pro(2,"먹태깡", 2000, 100);
        Pro p3 = new Pro(3,"소주깡", 3000, 100);
        Pro p4 = new Pro(4,"맥주깡", 3000, 100);

        System.out.println("--------------------------------");
        p1.ProInfo();
        System.out.println();
        p2.ProInfo();
        System.out.println();
        p3.ProInfo();
        System.out.println();
        p4.ProInfo();
        System.out.println();
        System.out.println("--------------------------------");

        c1.addToCart(p1, 20);
        c1.buy();
        c2.addToCart(p1, 90);
        c2.buy();

    }
}
