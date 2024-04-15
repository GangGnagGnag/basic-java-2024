package Health2;

public class PTStudy extends ResChoice  {

    public static void ptstudy() {
        System.out.println("회원 이름을 입력하세요");
        String name = sc.nextLine();
        boolean found = false;

        for (Res PTname : res) {
            if (PTname.getMemberName().equals(name)) {
                System.out.println("==" + name + " 회원님의 등록된 운동 내역==");
                System.out.println(PTname.getPTStudy());

                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("등록된 회원이 없습니다.");
        }
    }
}