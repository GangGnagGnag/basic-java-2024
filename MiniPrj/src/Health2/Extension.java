package Health2;

public class Extension extends ResChoice{

    public static void extension() {
        Res re = new Res();
        int mPw;

        System.out.println("회원님의 아이디를 입력하여 주세요");
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

            boolean found = false;
            for(Res member : res) {
                if (member.getMemberId().equals(memberId) && member.getMemberPw() == mPw) {
                    re = member;
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("입력하신 회원정보가 없습니다.");
                break;
            }

            System.out.println("몇 회를 연장 하시겠습니까?");
            System.out.print(">> ");
            if (sc.hasNextInt()) {
                int plus = sc.nextInt();
                sc.nextLine(); //

                if (plus <= 0) {
                    System.out.println("0은 입력이 불가능합니다");
                } else {
                    re.addCount(plus);
                    System.out.println(plus + "회 연장 하였습니다");
                    System.out.println("남은 횟수는 : " + re.getCount());
                    break; // 올바른 숫자 입력시 반복문 종료
                }
            } else {
                System.out.println("입력한 값을 확인하세요. 숫자가 아닌 값이 입력되었습니다.");
                sc.next(); // 잘못된 입력을 버림
            }
        }
    }

}
