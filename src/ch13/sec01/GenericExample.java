package ch13.sec01;

public class GenericExample {
    public static void main(String[] args) {
//        Box<String> box1 = new Box<String>();     이것 처럼도 쓸수 있지만 6행처럼도 사용가능
        Box<String> box1 = new Box<>();             // <> 안에는 원하는 자료형을 사용하면 된다,
        box1.content = "안녕하세요";
        String str = box1.content;
        System.out.println(str);
//         Box를 생성할때 타입 파라미터를 T  대신  String으로 대체

//        Box<Integer> box2 = new Box<Integer>();
        Box<Integer> box2 = new Box<>();            // 기본자료형은 오지 못하기때문에 Integer 사용
        box2.content = 100;                         
        int value = box2.content;
        System.out.println(value);
//         Box를 생성할때 타입 파라미터를 T  대신  Integer로 대체
//          타입 파라미터를 대체 할때는 클래스 및 인터페이스이고,
//        강제 타입변환 없이 자동으로 타입 변환이 된다.
    }
}
