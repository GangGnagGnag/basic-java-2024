package 접근제어자.a;

public class AccessData {

    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod 호출" + publicField);
    }
    void defualtMethod(){
        System.out.println("defaultMethod 호출" + defaultField);
    }
    private void privateMethod() {
        System.out.println("privateMethod 호출" + privateField);
    }

    public void innerAccess() {     //여기 안에서는 메서드 내부 호출임.
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defualtMethod();
        privateMethod();
    }
}
