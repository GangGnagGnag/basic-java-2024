package 구구단;

import java.util.Scanner;

public class gugudan {

    static void plus(int a, int b) {        //static 일때는 매개변수에 타입을 넣어줘야함
        System.out.println("더하기 : " + (a + b));
    }
    static void mis(int a, int b) {
        System.out.println("뺀 값은 : " + (a - b));
    }
    static void ggop(int a, int b) {
        System.out.println("곱한 값은 : " + ( a * b));
    }
    static void nanugi(int a ,int b) {
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
        
        if(z.equals("+")) {
            plus(x, y);
        }
        else if (z.equals("-")) {
            mis(x, y);
        }
        else if(z.equals("*")) {
            ggop(x, y);
        }
        else if(z.equals("/")) {
            nanugi(x, y);
        }
        }
    }
