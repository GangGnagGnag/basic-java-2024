package Health2;

public class ShowAllMembers extends ResChoice{
    public static void showAllMembers() {
        if (res.isEmpty()) {
            System.out.println("현재 등록된 회원이 없습니다.");
        } else {
            System.out.println("\n======= 전체 회원 목록 =======");
            for (Res member : res) {
                System.out.println("이름: " + member.getMemberName());
                System.out.println("회원번호: " + member.getMemberId());
                System.out.println("남은 PT 횟수: " + member.getCount());
                System.out.println("=============================");
            }
        }
    }
}
