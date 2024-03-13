package Calc;

import java.util.Scanner;

public class 계산기 {
    static void p(int a, int b){
        System.out.println("더한 값은 : " + (a + b));
    }
    static void m(int a, int b){
        System.out.println("뺀 값은 : " + (a - b));
    }
    static void g(int a, int b){
        System.out.println("곱한 값은 : " + (a * b));
    }
    static void n(int a, int b){
        System.out.printf("나눈 값은 %.2f" , (double)a / b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        while (true){
            System.out.println();
            System.out.println("-------------------------------------");
            System.out.println("종료를 원하시면 숫자 0번을 눌리세요");
            System.out.print("첫번째 값을 입력하세요 : ");

            if (!sc.hasNextInt()) {
                System.out.println("숫자 이외에는 값을 입력할 수 없습니다");
                sc.nextLine();
                continue;
            }
            
            int x = sc.nextInt();
            
            if (x == 0 ) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

            System.out.print("두번째 값을 입력하세요 : ");

            if (!sc.hasNextInt()) {
                System.out.println("숫자 이외에는 값을 입력할 수 없습니다");
                sc.nextLine();
                continue;
            }

            int y = sc.nextInt();
            sc.nextLine();

            System.out.print("연산 기호를 입력하세요 : ");
            String z = sc.nextLine();

            if (y ==0 && z.equals("/")){
                System.out.println("0으로는 나눌수 없습니다");
                continue;
            }

            switch (z) {
                case "+" -> p(x, y);
                case "-" -> m(x, y);
                case "*" -> g(x, y);
                case "/" -> n(x, y);
                default -> System.out.println("잘못된 값입니다");
            }
        }
    }
}
