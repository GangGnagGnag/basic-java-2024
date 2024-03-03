package extends1.access.parent;

public class Parent {
    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("Parent.publicMethod");
    }
    protected void protectedMethod() {
        System.out.println("Parent.pretectedMethod");
    }
    void defaultMethod() {
        System.out.println("parent.defaultMetheod");
    }
    private void privateMethod() {
        System.out.println("parent.privateMethod");
    }
    public void printParent() {
        System.out.println("==Parent 메서드안==");
        System.out.println("publicValue = " + publicValue);
        System.out.println("publicValue = " + protectedValue);
        System.out.println("publicValue = " + defaultValue);
        System.out.println("publicValue = " + privateValue);

//        부모 메서드 안에서 모두 접근 가능
        defaultMethod();
        privateMethod();
    }

}
