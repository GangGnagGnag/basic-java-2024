package DTO;

import java.util.Scanner;

public class ResMain {
    static final String MANAGER_USERNAME = "ADER";  // 관리자 ID
    static final int MANAGER_PASSWORD = 1234;       // 관리자 비밀번호

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== 매니저 로그인 ======");

        while (true) {
            System.out.print("아이디를 입력하세요: ");
            String username = sc.nextLine();
            System.out.print("비밀번호를 입력하세요: ");
            int password;

            if (sc.hasNextInt()) {
                password = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("아이디 또는 비밀번호가 일치하지 않습니다. 다시 시도해주세요.");
                sc.nextLine();
                continue;
            }

            if (username.equals(MANAGER_USERNAME) && password == MANAGER_PASSWORD) {
                System.out.println("로그인 성공! 매니저로 접속합니다.");
                ResChoice resChoice = new ResChoice();
                resChoice.resChoice();
                break; // 로그인 성공시 무한루프 탈출
            } else {
                System.out.println("아이디 또는 비밀번호가 일치하지 않습니다. 다시 시도해주세요.");
            }
        }
    }
}