package extends1.superr2;

public class ClassC extends ClassB {
    public ClassC() {
//        super() 는 기본생성자 일때만 생략가능하다
        super(10,20);
        System.out.println("ClassC 생성자");
    }
}
