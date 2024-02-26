package fianl;

public class FinalLocalMain {
    public static void main(String[] args) {

//        final 지역변수
        final int data1;
        data1 = 10;     // final은 최초 한번만 할당가능
//        data1 = 20;   //컴파일오류

//        final 지역변수2
        final int data2 = 10;
//        data2 = 20;   // 동일하게 컴파일오류
        method(10);

    }
    static void method(final int parameter) {
//        parameter = 20; 최초의 값을 넣어서 컴파일오류
    }
}
