package 은행관리2;

import java.util.HashMap;
import java.util.Map;

public class BankManagement {
    private Map<String, Account> accounts; // 계좌를 저장할 Map

    // 생성자: 계좌를 저장할 Map 초기화
    public BankManagement() {
        this.accounts = new HashMap<>();
    }

    // 새로운 계좌를 등록하는 메서드
    public void addAccount(Account account) {
        accounts.put(account.getAcNum(), account);
        System.out.println("계좌가 생성되었습니다: " + account.getAcNum());
    }

    // 계좌에 입금하는 메서드
    public void deposit(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit((int) amount);
        } else {
            System.out.println("해당 계좌를 찾을 수 없습니다.");
        }
    }

    // 계좌에서 출금하는 메서드
    public void withdraw(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw((int) amount);
        } else {
            System.out.println("해당 계좌를 찾을 수 없습니다.");
        }
    }
}
