package DTO;

import java.util.Scanner;

public class ResMain {
    static final String MANAGER_USERNAME = "ADER";
    static final int MANAGER_PASSWORD = 1234; //
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== 매니저 로그인 ===");
        System.out.print("아이디를 입력하세요: ");
        String username = sc.nextLine();
        System.out.print("비밀번호를 입력하세요: ");
        int password; //
        while(true){
            if(sc.hasNextInt()){
                password = sc.nextInt();
                sc.nextLine();
                break;
            } else {
                System.out.println("비밀번호를 다시 입력하여 주세요");
                sc.nextLine();
                System.out.print("비밀번호를 입력하세요: ");
            }
        }
        
        if (username.equals(MANAGER_USERNAME) && password == MANAGER_PASSWORD) {
            System.out.println("로그인 성공! 매니저로 접속합니다.");
            ResChoice resChoice = new ResChoice();
            resChoice.resChoice();
        } else {
            System.out.println("로그인을 실패하였습니다 프로그램을 종료합니다.");
        }
    }
}