package ch09.sec02.exam01;

public class A {
        //	인스턴스 맴버 클래스
        class B{}

        //	인스턴스 필드 값으로 B객체 대입
        B field = new B();

        //	생성자
        A(){
            B b = new B();
        }
//	클래스 B의 주소를 생성해서 저장가능(일반적인생성)
//	맴버로서 클래스 안에 들어가있음.

        //	인스턴스 메소드
        void method() {
            B b = new B();    // 로컬 클래스
        }
}

