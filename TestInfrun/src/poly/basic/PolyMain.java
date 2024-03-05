package poly.basic;

import java.sql.SQLOutput;

public class PolyMain {
    public static void main(String[] args) {
//        부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

//        자식 변수가 자식 인스턴스 참조
        System.out.println("child -> child");
        Child child = new Child();
        child.parentMethod();
        child.ChildMethod();

//        부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("parent -> child");
        Parent poly = new Child();
        poly.parentMethod();
//        부모는 자식을 담을 수 있다.
    }
}


