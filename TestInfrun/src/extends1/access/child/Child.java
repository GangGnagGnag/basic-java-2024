package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call(){
        publicValue = 1;
        protectedValue = 1; //상속관계 or 같은 패키지
//        defaultMethod = 1; //다른패키지 접근불가
//        privateMethod = 1; // 접근불가

        publicMethod();
        protectedMethod();//상속관계 or 같은 패키지
//        defaultMethod();//다른패키지 접근불가
//        privateMethod();// 접근불가

        printParent();

    }
}
