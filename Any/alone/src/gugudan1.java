import java.util.Scanner;

public class gugudan1 {
    /*
    클래스 안에 있는거는 필드
     */
    int a;
    int b;

    gugudan1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void plus() {        //static 일때는 매개변수에 타입을 넣어줘야함
        System.out.println("더하기 : " + (a + b));
    }

    void mis() {
        System.out.println("뺀 값은 : " + (a - b));
    }

    void ggop() {
        System.out.println("곱한 값은 : " + (a * b));
    }

    void nanugi() {
        System.out.println("나눈 값은 : " + (a / b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("값을 입력하세요 : ");
        int x = sc.nextInt();

        System.out.println("값을 입력하세요 : ");
        int y = sc.nextInt();
        sc.nextLine();

        System.out.println("무엇을 하고 싶농? ");
        String z = sc.nextLine();

        gugudan1 g = new gugudan1(x,y);

        if (z.equals("+")) {
            g.plus();
        }
        else if (z.equals("-")) {
            g.mis();
        }
        else if (z.equals("*")) {
            g.ggop();
        }
        else if (z.equals("/")) {
            g.nanugi();
        }
    }
}
