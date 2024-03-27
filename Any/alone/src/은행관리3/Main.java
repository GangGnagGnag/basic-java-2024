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
    public static void createAccount(){
        System.out.print("계좌번호 : ");
        String accountNum = sc.nextLine();

        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("금액 : ");
        int balance = sc.nextInt();
        sc.nextLine();

        accounts.add(new Account(accountNum, name, balance));

        System.out.println("계좌가 개설되었습니다.");
    }

    public static void cheakBalance() {
        System.out.print("계좌번호를 입력하세요 : ");
        String accountNum = sc.nextLine();

        int AN = makeAccouontNum(accountNum);
        if(AN != -1) {
            System.out.println("계좌번호 : " + accountNum);
            System.out.println("잔액 : " + accounts.get(AN).getBalance());
        } else {
            System.out.println("계좌번호를 확인해 주세요");
        }
    }

    public static void checkIn(){

        System.out.print("계좌번호 : ");
        String accountNum = sc.nextLine();

        System.out.print("입금액 : ");
        int amount = sc.nextInt();

        int AN = makeAccouontNum(accountNum);
        if(AN != -1){
            accounts.get(AN).deposit(amount);
        }
        else {
            System.out.println("계좌번호가 없습니다.");
        }
    }

}
