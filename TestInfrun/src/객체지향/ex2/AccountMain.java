package 객체지향.ex2;

public class AccountMain {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.deposit(10000);
        ac.deposit(4000);
        ac.withdraw(40000);  //잔액 부족 오류
        System.out.println("잔액:" + ac.balace);
    }
}
