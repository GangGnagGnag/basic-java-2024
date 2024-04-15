package DTO;

public class CreateMember extends ResChoice {

    public static void createMember() {
        Res newMember = new Res();

        while (true) {
            System.out.println("\n등록하실 ID(전화번호)를 입력하세요.");
            System.out.print(">> ");
            String memberId = sc.nextLine();

//            아이디가 있는지 확인
            boolean checkId = true;
            for (Res member : res) {
                if (member.getMemberId().equals(memberId)) {
                    checkId = false;
                    break;
                }
            }
            if(!checkId){
                System.out.println("이미 존재하는 아이디 입니다.");
                continue;
            }

            newMember.setMemberId(memberId);
            System.out.println();

            while (true) {
                System.out.print("등록하실 비밀번호 4자리를 입력하세요(ex: 1234) ");
                System.out.print(">> ");
                if (sc.hasNextInt()) {
                    int memberPw = sc.nextInt();
                    sc.nextLine();
                    newMember.setMemberPw(memberPw);
                } else {
                    System.out.println("\n 잘못된 입력입니다 \n");
                    sc.next();
                    continue;
                }
                System.out.println("\n회원님 이름을 적어주세요");
                System.out.print(">> ");
                String name = sc.nextLine();
                newMember.setMemberName(name);

                while (true) {
                    System.out.println("\n등록하실 PT횟수를 입력하세요");
                    System.out.print(">> ");

                    if (sc.hasNextInt()) {
                        int PT = sc.nextInt();
                        sc.nextLine();
                        if (PT <= 0) {
                            System.out.println("0은 입력이 불가능 합니다");
                            continue;
                        } else {
                            newMember.setCount(PT);
                        }
                    } else {
                        System.out.println("숫자가 아닌 값이 입력되었습니다.");
                        sc.next();
                        continue;
                    }

                    res.add(newMember);

                    System.out.println("\n================================================");
                    System.out.println("회원 등록이 완료.");
                    System.out.println(newMember.getMemberName() + " 님의 회원번호는" + newMember.getMemberId());
                    System.out.println("(*비밀번호는 다른 사람에게 노출되지않게 주의하여주세요*)");
                    System.out.println("비밀번호는 " + newMember.getMemberPw() + "입니다 ");
                    System.out.println("남은 PT 횟수는 " + newMember.getCount() + "회 입니다");
                    System.out.println("==============================================");

                    // PT 입력이 완료되면 루프 탈출
                    break;
                }
                // 비밀번호 입력이 완료되면 루프 탈출
                break;
            }
            // ID 입력이 완료되면 루프 탈출
            break;
        }
    }
}
