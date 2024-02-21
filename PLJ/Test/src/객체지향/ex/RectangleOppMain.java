package 객체지향.ex;

public class RectangleOppMain {     //객체지향으로 변경하기
    public static void main(String[] args) {
        Rectangle rc = new Rectangle();
        rc.width = 5;
        rc.height = 8;

        int area = rc.calculateArea();
        System.out.println("넓이: " + area);

        int perimeter = rc.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = rc.isSquare();
        System.out.println("정사각형 여부: " + square);
    }
}
