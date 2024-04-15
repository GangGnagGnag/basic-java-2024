package Health2;

public class PT extends ResChoice{
    public static void pt(){
        boolean found = false; // 회원이름이 있는지 여부를 나타내는 변수

        while (true) {
            System.out.print("회원님의 이름을 입력하세요 : ");
            String name = sc.nextLine();

            for (Res Mname : res) {
                if (Mname.getMemberName().equals(name)) {
                    found = true; // 회원이름을 찾았음을 표시
                    System.out.println(name + " 회원님 수업을 시작하겠습니다");
                    System.out.println("수업을 시작합니다.");

                    StringBuilder PT = new StringBuilder();
                    for (int i = 1; i <= 5; i++) {
                        System.out.print(i + "번 운동: ");
                        String PTStudy = sc.nextLine();
                        PT.append(PTStudy);
                        if (i < 5) {
                            PT.append("\n"); //운동을 한줄 띄워서 표시
                        }
                    }
                    String PTM = PT.toString();
                    // 회원 객체에 모든 운동 정보를 하나의 변수에 저장
                    Mname.setPTStudy(PTM);
                    if (Mname.getCount() > 0) {
                        Mname.subCount(1); // 등록된 회원의 횟수를 감소
                        System.out.println("\n ==운동 정보==");
                        System.out.println(Mname.getPTStudy());
                        System.out.println("**남은 횟수는 " + Mname.getCount() + "번 입니다 연장 부탁드립니다**");
                    }
                    // 해당 회원의 운동 정보를 저장한 후 반복문 종료
                }
            }
            // 만약 회원이름을 찾지 못했다면 메시지 출력
            if (!found) {
                System.out.println("등록된 회원이 없습니다");
            }
            break;
        }
    }
}