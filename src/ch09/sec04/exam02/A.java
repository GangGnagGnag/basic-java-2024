package ch09.sec04.exam02;

public class A {
//    매소드
    void useB() {
//        로컬 클래스
        class B {
            //            인스턴스 필드
            int field1 = 1;

            //            정적 필드
            static int field2 = 2;

//            접근제한자가 필요없는이유는 메소드를 벗어나게 되면 사용이 안되기 때문이다.

            //            생성자
            B() {
                System.out.println("B-생성자 실행");
            }

//        인스턴스 메소드
        void method1() {
            System.out.println("B-method1 실행");
        }

        static void method2() {
            System.out.println("B-method2 실행");
        }
    }       // 로컬 클래스가 끝나는 곳(지역의미가 강함)

//    로컬 객체 생성
    B b = new B();                      //B 클래스가 method1에 들어가 있기 때문에

//    로컬 객체의 인스턴스 필드와 메소드 사용
    System.out.println(b.field1);
    b.method1();

//    로컬 클래스의 정적 필드와 메소드 사용
    System.out.println(B.field2);
    B.method2();
    }   //use B 가 끝나는곳
}
