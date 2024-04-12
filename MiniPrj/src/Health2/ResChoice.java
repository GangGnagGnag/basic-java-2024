package Health2;

import java.util.ArrayList;
import java.util.Scanner;

public class ResChoice {
    static ArrayList<Res> res = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void resChoice() {
        boolean yes = true;
        int choice;

        while (yes) {
            System.out.println("\n===============================================================");
            System.out.println("1. 회원 등록 | 2. 전체 회원 조회 | 3. PT연장 | 4. 회원 삭제 | 5. 종료 ");
            System.out.println("===============================================================");

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
                    CreateMember.createMember();
                    break;
                case 2:
                    System.out.println("1. 개별 회원 조회 | 2. 전체 회원 조회");
                    int subChoice = sc.nextInt();
                    sc.nextLine(); // 개행 문자 처리

                    switch (subChoice) {
                        case 1:
                            MemberList.memberList();
                            break;
                        case 2:
                            ShowAllMembers.showAllMembers();
                            break;
                        default:
                            System.out.println("잘못된 입력입니다.");
                            break;
                    }
                    break;
                case 3:
                    Extension.extension();
                    break;
                case 4:
                    DeleteMember.deleteMember();
                    break;
                case 5:
                    System.out.println("종료합니다");
                    yes = false;
                    break; // 선택 5일 때 종료
                default:
                    System.out.println("잘못된 입력 입니다.");
            }
        }
    }
}