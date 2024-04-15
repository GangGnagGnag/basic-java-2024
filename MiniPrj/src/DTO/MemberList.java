package DTO;

public class MemberList extends ResChoice {

    public static void memberList() {
        boolean run = false;
        int mPw;
        System.out.println("\n회원 ID를 입력하세요");
        System.out.print(">> ");
        String memberId = sc.nextLine();

        while (true) {
            System.out.println("\n비밀번호를 입력하세요");
            System.out.print(">> ");

            if (sc.hasNextInt()) {
                mPw = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("\n 잘못된 입력입니다.");
                sc.nextLine(); // 잘못된 입력값 버리기
                continue;
            }

            for (Res member : res) {
                if (member.getMemberId().equals(memberId) && member.getMemberPw() == mPw) {
                    System.out.println("\n=================회원 조회=================");
                    System.out.println("이름: " + member.getMemberName());
                    System.out.println("회원번호: " + member.getMemberId());
                    System.out.println("남은 PT 횟수: " + member.getCount());
                    System.out.println("==========================================");

                    run = true;
                    break;
                }
            }
            if (!run) {
                System.out.println("일치하는 회원이 없습니다");
                break;
            }
            break;
        }
    }
}
