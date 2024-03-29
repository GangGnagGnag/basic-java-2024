package comAbst.exPhone;
/*
인터페이스 > 구현 클래스 > 구현객체 생성
 */

public interface Phone {
    public static final int version = 10;   // 상수필드
    String getNamefacture();    // 추상메서드
    String getOs();             // 추상메서드 ( 추상클래스 )
}
class IPhone implements Phone{

    @Override
    public String getNamefacture() {
        return "apple";
    }

    @Override
    public String getOs() {
        return "MacOs";
    }
    void fieldInfo(){
        System.out.println(version);
    }
}

class Galaxy implements Phone{

    @Override
    public String getNamefacture() {
        return "samsung";
    }

    @Override
    public String getOs() {
        return "Android";
    }
    void fieldInfo() {
        System.out.println(version);
    }
}

class Main{
    public static void main(String[] args) {
        Phone p = new Galaxy();     // 인터페이스
        System.out.println(p.getNamefacture());
        System.out.println(p.getOs());
//        p.version;
        System.out.println("나의 휴대폰은 " + p.getNamefacture() + " 운영체제는 " + p.getOs());

        p= new IPhone();
        System.out.println(p.getNamefacture());
        System.out.println(p.getOs());
        System.out.println("나의 휴대폰은 " + p.getNamefacture() + " 운영체제는 " + p.getOs());
        System.out.println("-----------------------------");


        Phone p1 = new Phone() {
            @Override
            public String getNamefacture() {
                return "알뜰폰";    // 익명구현객체
            }

            @Override
            public String getOs() {
                return "Android";
            }
        };

        System.out.println(p1.getNamefacture());
        System.out.println(p1.getOs());

        Galaxy g = new Galaxy();
        g.fieldInfo();

    }
}
