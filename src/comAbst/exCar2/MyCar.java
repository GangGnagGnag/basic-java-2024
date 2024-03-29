package comAbst.exCar2;

public class MyCar {
//    맴버변수 - 필드, 속성
    String company;
    String model;
    String color;

//    생성자 - 객체 생성과 초기화를 담당한다
    MyCar () {  // 디폴트 생성자로 람보르기니를 만들어줬기때문에 
//        company = "람보르기니";
//        model = "아벤타도르";
//        color = "Yellow";
        this("람보르기니", "아벤타도르", "Yellow");   // 자기자신의 메서드를 호출
    }   

    MyCar(String company) {
        this.company = company;
    }

    MyCar(String company, String model, String color){
        this.company = company;
        this.model = model;
        this.color = color;
    }


//    맴버함수

    void MyCarPrint(){
        System.out.println("자동차 정보");
        System.out.println("내 차는 " + company + " 회사의 " + model + "이고 색상은 " + color);
        System.out.println("---------------------------------------------------");
    }

public static void main(String[] args) {
    MyCar mc = new MyCar("RR","ghost" ,"black");
    MyCar mc1 = new MyCar(); // 디폴트 생성자를 사용하면 람보르 기니만 사용할 수 있음
    MyCar mc2 = new MyCar("KIA");
    mc.MyCarPrint();
    mc1.MyCarPrint();
    mc2.MyCarPrint();


    }
}
