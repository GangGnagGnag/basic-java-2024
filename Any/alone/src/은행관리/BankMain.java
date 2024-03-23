package 은행관리;
/*
deposit 입금
withdraw 출금
getBalance 잔액확인
 */

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.deposit(10000);
        bank.withdraw(5000);
        System.out.println("잔액은 : " + bank.getBalance());
    }
}
