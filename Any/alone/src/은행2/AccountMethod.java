package 은행2;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountMethod {
    ArrayList<Account> accounts = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void accountMethod() {
        boolean run = true;

        while (run) {
            System.out.println("==============================================");
            System.out.println("1.계좌생성, 2.계좌목록, 3.입금, 4.출금, 5.종료");
            System.out.println("==============================================");

            System.out.print("번호를 입력하세요 : ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1){
                creatAccount();
            } else if (choice == 2) {
                accountList();
            } else if (choice == 3) {
                return;                
            } else if (choice == 4){
                return;
            } else if (choice == 5){
                System.out.println("프로그램 종료");
                run = false;
            } else {
                System.out.println("잘못 눌리셨습니다.");
                continue;
            }
        }
    }

    public void creatAccount() {
        int number = 0;
        boolean isValidInput = false;
        Account newAc = new Account();
        System.out.println("----------------------------------------------------");
        System.out.println("사용하실 계좌반호를 입력하세요");
        System.out.print(">> ");
        String an = sc.nextLine();
        newAc.setAcNum(an);

        System.out.println("이름을 입력하세요.");
        System.out.print(">> ");
        String sn = sc.nextLine();
        newAc.setName(sn);

        System.out.print("입금 : ");

        while (!isValidInput) {
            if (sc.hasNextInt()) {
                int deposit = sc.nextInt();
                isValidInput = true;
                newAc.setBalance(deposit);
            } else {
                System.out.println("입력한 값을 확인하세요. 숫자가 아닌 값이 입력되었습니다.");
                sc.next(); // 잘못된 입력을 버림
                System.out.print("값을 다시 입력하세요 ");
                System.out.print(">>");
                continue;
            }
            accounts.add(newAc);

            System.out.println();
            System.out.println(sn + "님의 계좌를 만들었습니다.");
            System.out.println("계좌번호는 " + an + " 입니다");
        }
    }
    
    public void accountList(){
        System.out.println("계좌목록");
        System.out.println();
        int length = accounts.size();

        for(int i = 0; i<length; i++){
            String a = accounts.get(i).getAcNum();
            String n = accounts.get(i).getName();
            int b = accounts.get(i).getBalance();

            System.out.println("계좌번호 = " + a);
            System.out.println("이름 = " + n);
            System.out.println("잔액 = " + b);
            System.out.println();
        }
    }
}




