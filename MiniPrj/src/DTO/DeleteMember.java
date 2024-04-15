package DTO;

public class DeleteMember extends ResChoice {
    static boolean run = true;
    public static void deleteMember() {
        int choice;
        while (run) {
            System.out.println("\n회원을 삭제 하시겠습니까?");
            System.out.println("  1.예  |  2.아니오 ");
            System.out.print(">> ");
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("잘못된 입력입니다.");
                sc.nextLine(); // 잘못된 입력값 버리기
                continue;
            }

            switch (choice) {
                case 1:
                    yes();
                    break;
                case 2:
                    run = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    public static void yes() {
        Res re = new Res();
        int ch;
        int mPw;
        System.out.println("\n회원님의 아이디를 입력하여 주세요");
        System.out.print(">> ");
        String memberId = sc.nextLine();

        while (run) {
            System.out.println("\n비밀번호를 입력하세요");
            System.out.print(">> ");

            if (sc.hasNextInt()) {
                mPw = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("\n잘못된 입력입니다.");
                sc.nextLine(); // 잘못된 입력값 버리기
                continue;
            }

            boolean found = false;
            for (Res member : res) {
                if (member.getMemberId().equals(memberId) && member.getMemberPw() == mPw) {
                    re = member;
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("\n입력하신 회원정보가 없습니다.");
                break;
            }

            while (run) {
                System.out.println("\n회원을 삭제 하시겠습니까?");
                System.out.println("  1.예  |  2.아니오 ");
                System.out.print(">> ");
                if (sc.hasNextInt()) {
                    ch = sc.nextInt();
                    sc.nextLine();
                } else {
                    System.out.println("잘못된 입력입니다.");
                    sc.nextLine(); // 잘못된 입력값 버리기
                    continue;
                }
                if(ch == 1){
                    System.out.println("삭제됨");
                    res.remove(re);
                    run = false;
                }
            } run = false;
        }
    }
}
