package suepr2;

public class ClassB extends ClassA{

    public ClassB(int a) {
        super(); // 기본생성자 생략가능
        System.out.println("ClassB 생성자 a = " + a);
    }
}
