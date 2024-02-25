package Static2;

public class Decomain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DeciUtil2.deco(s);
        // static 이 붙으면 객체 생성없이 클래스명으로 바로 접근 가능

        System.out.println("before: " + s);
        System.out.println("after: " + deco);

    }
}
