package 접근제어자;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bk = new BankAccount();
        bk.deposit(50000);
        bk.withdraw(30000);
        System.out.println("잔액은 : " + bk.getBalance());
    }

}
