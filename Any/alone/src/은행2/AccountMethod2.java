package 은행2;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountMethod2 {
    static boolean run = false;
    ArrayList<Account> accounts = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void accountMethod() {
        boolean yes = true;
        int ch;
        while (yes) {
            System.out.println("==============================================");
            System.out.println("1.계좌생성, 2.계좌목록, 3.입금, 4.출금, 5.종료");
            System.out.println("==============================================");

            System.out.print("번호를 입력하세요 : ");

            if (sc.hasNextInt()) {
                ch = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("잘못 눌리셨습니다.");
                sc.nextLine(); // 잘못된 입력을 버림
                continue;
            }
            switch (ch) {
                case 1:
                    creatAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    yes = false; // 프로그램 종료
                    break;
                default:
                    System.out.println("번호를 확인하세요.");
            }
        }
    }

    public void creatAccount() {
        Account newAc = new Account();

        while (true) {
            System.out.println();
            System.out.println("사용하실 계좌번호를 입력하세요");
            System.out.print(">> ");
            int an;
            if (sc.hasNextInt()) {
                an = sc.nextInt();
                sc.nextLine();
                newAc.setAcNum(an);
            } else {
                System.out.println("입력한 값을 확인하세요. 숫자가 아닌 값이 입력되었습니다.");
                sc.next(); // 잘못된 입력을 버림
                System.out.print("값을 다시 입력하세요 ");
                continue;
            }
            // 같은 계좌번호가 있는지 확인
            boolean checkAc = false;        //  true 로 값을 변경하게 되면 계속 같은 부분이 반복되기 때문에 false 로 선언후
            for (Account account : accounts) {
                if (account.getAcNum() == an) {
                    checkAc = true;         // 여기서 true 로 변경해줏기
                    break;
                }
            }
            if (checkAc) {
                System.out.println("이미 있는 계좌번호입니다. 다른 번호를 입력하세요.");
                continue;
            } else {
                newAc.setAcNum(an);
            }

            System.out.println("이름을 입력하세요.");
            System.out.print(">> ");
            String sn = sc.nextLine();
            newAc.setName(sn);

            System.out.print("입금 : ");

            if (sc.hasNextInt()) {
                int deposit = sc.nextInt();
                sc.nextLine();
                if (deposit <= 0) {
                    System.out.println("입력한 값을 확인하세요. 0원이하의 값이 입력되었습니다.");
                    System.out.print("값을 다시 입력하세요 ");
                    continue;
                } else {
                    run = true;
                    newAc.setBalance(deposit);
                }
            } else {
                System.out.println("입력한 값을 확인하세요. 숫자가 아닌 값이 입력되었습니다.");
                sc.next(); // 잘못된 입력을 버림
                System.out.print("값을 다시 입력하세요 ");
                continue;
            }
            accounts.add(newAc);

            System.out.println();
            System.out.println(sn + "님의 계좌를 만들었습니다.");
            System.out.println("계좌번호는 " + newAc.getAcNum() + " 입니다");
            break;
        }
    }

    public void accountList() {
        System.out.println();
        System.out.println("계좌목록");

        for (Account account : accounts) {  // 향상된 for문
            int an = account.getAcNum();
            String na = account.getName();
            int ba = account.getBalance();

            System.out.println("계좌번호 = " + an);
            System.out.println("이름 = " + na);
            System.out.println("잔액 = " + ba);
            System.out.println();
        }
    }

    public void deposit() {
        Account ac = new Account();
        while (true) {
            System.out.println("입금하실 계좌번호를 입력하세요");
            System.out.print(">> ");
            int an;
            if (sc.hasNextInt()) {
                an = sc.nextInt();
                sc.nextLine(); // 개행문자 제거

                boolean found = false;
                for (Account a : accounts) {
                    if (a.getAcNum() == an) {
                        ac = a;
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("입력하신 계좌번호에 해당하는 계좌가 없습니다");
                    continue; // 다시 계좌번호 입력받기
                }
            } else {
                System.out.println("입력한 값을 확인하세요. 숫자가 아닌 값이 입력되었습니다.");
                sc.next(); // 잘못된 입력을 버림
                continue; // 다시 입력받기
            }

            System.out.println("입금하실 금액을 입력하세요");
            System.out.print(">> ");
            if (sc.hasNextInt()) {
                int dp = sc.nextInt();
                sc.nextLine(); // 개행문자 제거

                if (dp <= 0) {
                    System.out.println("0원은 입금이 불가능합니다");
                    continue; // 다시 입력받기
                } else {
                    ac.addBalance(dp);
                    System.out.println(dp + "원이 입금되었습니다");
                    System.out.println("잔액 : " + ac.getBalance());
                    break; // 올바른 입금 금액 입력 시 반복문 종료
                }
            } else {
                System.out.println("입력한 값을 확인하세요. 숫자가 아닌 값이 입력되었습니다.");
                sc.next(); // 잘못된 입력을 버림
                continue; // 다시 입력받기
            }
        }
    }


    public void withdraw() {    // while 문 2개로 묶음
        Account ac = new Account();
        int an;
        int wd;

        while (true) {
            System.out.println("출금하실 계좌번호를 입력하세요");
            System.out.print(">> ");
            if (sc.hasNextInt()) {
                an = sc.nextInt();
                for (Account a : accounts) {
                    if (a.getAcNum() == an) {
                        ac = a;
                        break;
                    }
                }
                if (ac != null) {
                    while (true) {
                        System.out.println("출금하실 금액을 입력하세요");
                        System.out.print(">> ");
                        if (sc.hasNextInt()) {
                            wd = sc.nextInt();
                            if (wd <= 0) {
                                System.out.println("0원 이하의 금액은 출금이 불가능합니다.");
                            } else if (wd > ac.getBalance()) {
                                System.out.println("잔액이 부족합니다.");
                            } else {
                                ac.subBalance(wd);
                                System.out.println(wd + "원이 출금되었습니다");
                                System.out.println("잔액 : " + ac.getBalance());
                                return; // 출금성공
                            }
                        } else {
                            System.out.println("숫자를 입력하세요.");
                            sc.next(); // 잘못된 입력을 제거후 다음 입력을 받음
                        }
                    }
                } else {
                    System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
                }
            } else {
                System.out.println("숫자를 입력하세요.");
                sc.next(); // 잘못된 입력을 제거후 다음 입력을 받음
            }
        }
    }
}