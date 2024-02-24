package 객체지향.Music;

public class Value {
    public static void main(String[] args) {
        ValueObj obj = new ValueObj();

        obj.add();
        obj.add();
        obj.add();
        System.out.println("최종 숫자는: " + obj.value);
    }
}
