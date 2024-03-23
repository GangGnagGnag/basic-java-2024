package 은행관리;

public class Bank {
    private int balance; // 통장잔고

    public Bank() {
        this.balance = 0;   //통장잔고 0원
    }

    //    입금 출금이 가능한지에 대한 확인 메서드 잔액이 0 보다 커야함
    private boolean amountBalance(int amount) {
        return amount > 0;
    }

    //    입금 메서드
    public void deposit(int amount) {
        if (amountBalance(amount)) {
            balance += amount;
        } else {
            System.out.println("입급할수 있는 금액이 아닙니다");
        }
    }


    //    출금 메서드
    public void withdraw(int amount) {
        if (amountBalance(amount) && balance - amount >= 0) { // 잔고에 출금할 금액이 0보다 커야함
            balance -= amount;
        } else {
            System.out.println("잔액이 부족합니다");
        }
    }

//    잔액확인
    public int getBalance() {
        return balance;
    }
}
