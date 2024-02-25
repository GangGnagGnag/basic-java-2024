package Static2;

public class DecoData {
    private  int instanceValue; //인스턴스 변수
    private  static int staticValue; // 정적 변수

    public static void staticCall() {
//        instanceValue++;  //인스턴스 변수 접근
//        instancMethod();  //인스턴스 메서드 접근

        staticValue++; // 정적 변수 접근
        staticMethod(); //정적 매서드 접근
    }
    public void instanceCall(){
        instanceValue++;  //인스턴스 변수 접근
        instanceMethod();  //인스턴스 메서드 접근

        staticValue++; // 정적 변수 접근
        staticMethod(); //정적 매서드 접근
    }


    private void instanceMethod(){  //인스턴스 메서드
        System.out.println("instanceValue= " + instanceValue);

    }
    private static void staticMethod(){ //정적 매서드
        System.out.println("staticValue= " + staticValue);
    }
}
