package 은행관리3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Account> accounts = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in); // 사용가능하게 만들어줌

    //    계좌확인 메서드
    public static int makeAccouontNum(String accountNum) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNum().equals(accountNum)) {
                return 1;
            }
        }
        return -1;
    }


    //    계좌개설
    public static void createAccount() {
            System.out.print("계좌번호 : ");
            sc.nextLine();
            String accountNum = sc.nextLine();

            System.out.print("이름 : ");
            String name = sc.nextLine();

            System.out.print("금액 : ");
            if (!sc.hasNextInt()) {
                System.out.println("숫자만 입력 가능합니다");
                sc.nextLine();
            }

            int balance = sc.nextInt();
            sc.nextLine();

            accounts.add(new Account(accountNum, name, balance));

            System.out.println("계좌가 개설되었습니다.");
        }

        // 잔액 조회
        public static void cheakBalance () {
            System.out.print("계좌번호를 입력하세요 : ");
            String accountNum = sc.nextLine();
            sc.nextLine();

            int AN = makeAccouontNum(accountNum);
            if (AN != -1) {
                System.out.println("계좌번호 : " + accountNum);
                System.out.println("잔액 : " + accounts.get(AN).getBalance());
            } else {
                System.out.println("계좌번호를 확인해 주세요");
            }
        }

//    입금
        public static void checkIn () {

            System.out.print("계좌번호 : ");
            String accountNum = sc.nextLine();

            System.out.print("입금액 : ");
            int amount = sc.nextInt();

            int AN = makeAccouontNum(accountNum);
            if (AN == 1) {
                accounts.get(AN).deposit(amount);
            } else {
                System.out.println("계좌번호가 없습니다.");
            }
        }

        public static void cheakOut () {
            System.out.print("계좌번호 : ");
            String accountNum = sc.nextLine();

            System.out.print("출금액 : ");
            int amount = sc.nextInt();
            sc.nextLine();

            int AN = makeAccouontNum(accountNum);
            if (AN == -1) {
                accounts.get(AN).withdraw(amount);
                System.out.println(amount + "원이 입급되었습니다");
            } else {
                System.out.println("계좌번호가 없습니다");
            }
        }

    public static void main (String[]args){
        boolean exit = false;

            do {
                System.out.println("====== 은행 입출금 관리 시스템 ======");
                System.out.println("1. 계좌 개설");
                System.out.println("2. 잔액 조회");
                System.out.println("3. 입금");
                System.out.println("4. 출금");
                System.out.println("5. 종료");
                System.out.println("항목을 선택하세요");

                int menu = sc.nextInt();
                switch (menu) {
                    case 1:
                        System.out.println("계좌개설");
                        createAccount();
                        break;
                    case 2:
                        System.out.println("잔액조회");
                        cheakBalance();
                        break;
                    case 3:
                        System.out.println("입금");
                        checkIn();
                        break;
                    case 4:
                        System.out.println("출금");
                        cheakOut();
                        break;
                    case 5:
                        System.out.println("종료");
                        exit = true;
                        break;
                    default:
                        System.out.println("다시입력");
                }
            } while (!exit);
        }
}
