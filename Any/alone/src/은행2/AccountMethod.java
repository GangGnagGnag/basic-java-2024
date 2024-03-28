package 은행2;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountMethod {
    ArrayList<Account> accounts = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void  accountMethod() {
        boolean run = true;

        while (run) {
            System.out.println("==============================================");
            System.out.println("1.계좌생성, 2.계좌목록, 3.입금, 4.출금, 5.종료");
            System.out.println("==============================================");

            System.out.print("번호를 입력하세요 : ");
            int choice = sc.nextInt();
            sc.nextLine();
        }
    }

    public void creatAccount() {
        Account newAc = new Account();
        System.out.println("----------------------------------------------------");
        System.out.print("사용하실 계좌반호를 입력하세요");
        System.out.print(">> ");
        String an = sc.nextLine();
        newAc.setAcNum(an);


    }
}



