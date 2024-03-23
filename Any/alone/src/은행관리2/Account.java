package 은행관리2;

public class Account {
    private String AcNum; // 계좌번호
    private int balance; // 잔액

    //  계좌번호와 초기 잔액을 받아서 객체를 초기화
    public Account(String AcNum, int balance) {
        this.AcNum = AcNum;
        this.balance = balance;
    }

    public String getAcNum() {
        return AcNum;
    }

    public int getBalance() {
        return balance;
    }

    //   입금 출금이 가능한지에 대한 확인 메서드 잔액이 0 보다 커야함
    private boolean amountBalance(int amount) {
        return amount > 0;
    }

    //  계좌 입금
    public void deposit(int amount) {
        if (amountBalance(amount)) {
            balance += amount;
            System.out.println("계좌번호 : " + AcNum);
            System.out.println(amount + "원이 입급되었습니다");
            System.out.println("잔액 : " + balance);
            System.out.println("---------------------------");
        } else {
            System.out.println("금액을 확인하여 주세요");
        }
    }
    // 계좌 출금
    public void withdraw(int amount){
        if (amountBalance(amount) && balance - amount >= 0) { // 잔고에 출금할 금액이 0보다 커야함
            balance -= amount;
            System.out.println("계좌번호 : " + AcNum);
            System.out.println(amount + "원이 출금되었습니다");
            System.out.println("잔액 : " + balance);
            System.out.println("---------------------------");
        } else {

            System.out.println("계좌번호 " + AcNum + " 의 잔액이 부족합니다");
        }
    }
}