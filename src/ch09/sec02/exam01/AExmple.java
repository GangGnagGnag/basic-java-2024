package ch09.sec02.exam01;

public class AExmple {

        public static void main(String[] args) {
//		A 객체 생성
            A a = new A();
//		인스턴스 맴버이기 때문에 A 객체 먼저 생성

//		B 객체 생성
            A.B b = a.new B();
//		A 객체를 먼저 생성하고 B 객체를 만들어야한다.
//		클래스 B가 A 클래스에 맴버이기 때문에 A클래스 객체를 먼저 생성해야 B클래스에 접근가능
            System.out.println(b.toString());
        }
    }

