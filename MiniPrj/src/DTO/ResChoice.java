package DTO;

import java.util.Scanner;

public class ResChoice {
    final public static String DB_URL           = "jdbc:oracle:thin:@localhost:1521:xe";
    final public static String DB_DRIVER_NAME   = "oracle.jdbc.driver.OracleDriver";
    final public static String DB_USER          = "ADER";   // 오라클 아이디
    final public static String DB_PW            = "1234";   // 오라클 비번
    static Scanner sc = new Scanner(System.in);   // static 을 사용해서 정적으로 선언

    public void resChoice() {
        boolean yes = true;
        int choice;

        while (yes) {
            System.out.println("\n=========================================================================");
            System.out.println("1. 회원 등록 | 2. 전체 회원 조회 | 3. PT연장 | 4. 회원 삭제 | 5.수업 | 6. 종료 ");
            System.out.println("=========================================================================");

            System.out.print("번호를 입력하여 주세요 >> ");

            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println(" 잘못된 입력입니다.");
                System.out.print("번호를 입력하여 주세요 >> ");
                sc.nextLine(); // 잘못된 입력값 버리기
                continue;
            }

            switch (choice) {
                case 1:
                    Insert.insertClass();
                    break;

                case 2:
                    look.lookClass();
                    break;

                case 3:
                    Extention.extention();
                    break;

                case 4:
                    DeleteMember.deleteMember();
                    break;

                case 5:
                    System.out.println("1. 수업 등록 | 2. 수업 조회 | 3. 뒤로가기");
                    System.out.print(">> ");
                    int subChoice = sc.nextInt();
                    sc.nextLine(); // 개행 문자 처리

                    switch (subChoice) {
                        case 1:
                            RegisterExercise.registerExercise();
                            break;
                        case 2:
                            PTStudy.studyList();
                            break;
                        case 3:
                            System.out.println("선택 창으로 돌아갑니다.");
                            break;
                        default:
                            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                            break;
                    }
                    break;
                case 6:
                    System.out.println("종료합니다");
                    yes = false;
                    break;

                default:
                    System.out.println("잘못된 입력 입니다.");

            }
        }
    }
}
