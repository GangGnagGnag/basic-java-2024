package extends1.superr2;

public class ClassB extends ClassA{

    public ClassB(int a) {
        super(); // 매게 변수가 없는 기본생성자는 생략가능
        System.out.println("ClassB 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        super(); // 기본생성자 생략가능
        System.out.println("ClassB 생성자 a=" + a + "b = " + b);


    }
}
