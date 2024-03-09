package Calc;

import java.util.Scanner;

public class Calc2while {
    static void plus(int a, int b) {
        System.out.println("두 수를 더한 값은 : " + (a + b));
        System.out.println("----------------------------");
    }   // 두 수를 더하는 값을 호출하는 메서드 생성

    static void mis(int a, int b) {
        System.out.println("두 수를 뺀 값은? : " + (a - b));
        System.out.println("----------------------------");
    }   // 두 수를 빼는 값을 호출하는 메서드 생성

    static void ggop(int a, int b) {
        System.out.println("두 수를 곱한 값은? : " + (a * b));
        System.out.println("----------------------------");
    }   // 두 수를 곱하는 값을 호출하는 메서드 생성

    static void nanum(int a, int b) {
        System.out.printf("두 수를 나눈 값은? : %.2f \n", (double) a / b);
        System.out.println("----------------------------");
        // 실수 타입인 double로 강제 형 변환후 printf로 소수점 2자리 까지 나타냄
    }   // 두 수를 나누는 값을 호출하는 메서드 생성

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) { // 무한루프
            System.out.println("종료를 원하시면 숫자 0번을 눌려주세요");
            System.out.println("--------------------------------");
            System.out.print("첫 번째 값을 입력하세요 : ");

            if (!sc.hasNextInt()) { // 입력이 숫자가 아닌 경우
                System.out.println("--------------------------------");
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                sc.nextLine(); // 잘못된 입력을 버림
                continue; // 다시 루프의 처음으로 돌아감
            }

            int x = sc.nextInt();   // 정수 값을 입력하고'

            if (x == 0) { // 입력한 값이 0일 경우 프로그램 종료
                System.out.println("프로그램을 종료합니다");
                break;
            }
            System.out.print("두 번째 값을 입력하세요 : ");

            if (!sc.hasNextInt()) { // 입력이 숫자가 아닌 경우
                System.out.println("----------------------------------");
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                sc.nextLine(); // 잘못된 입력을 버림
                continue; // 다시 루프의 처음으로 돌아감
            }
            int y = sc.nextInt();    // 정수 값을 입력하고
            sc.nextLine();          // 엔터키를 날려주는 역할

            System.out.print("연산 기호를 입력하세요(+,-,*,/) : ");
            String z = sc.nextLine();

            if (y == 0 && z.equals("/")) {   //y 의 값이 0 그리고 / 일 경우에는 
                System.out.println("0으로는 나눌 수 없습니다");   // 0 으로는 나눌 수 없습니다 출력
                continue;
            }


            // 연산기호를 입력하고 엔터를 눌리면 if 문의 연산기호에 맞는 값을줌
            if (z.equals("+")) {
                plus(x, y);
            } else if (z.equals("-")) {
                mis(x, y);
            } else if (z.equals("*")) {
                ggop(x, y);
            } else if (z.equals("/")) {
                nanum(x, y);
            } else {      // +,-,*,/ 가 아닌 다른 값을 입력 했을경우 실행
                System.out.println("값을 잘못 입력하셨습니다.");
            }
        }
    }
}