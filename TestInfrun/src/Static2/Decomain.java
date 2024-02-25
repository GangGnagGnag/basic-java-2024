package Static2;

public class Decomain {
    public static void main(String[] args) {
        String s = "hello java";
        DeciUtil1 utils = new DeciUtil1();
        String deco = utils.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);

    }
}
