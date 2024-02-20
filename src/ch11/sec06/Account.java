package ch11.sec06;

import javax.naming.InsufficientResourcesException;

public class Account {
    private long balance;

    public Account() { }

    public long getBalance() {
        return balance;
    }
    public void deposit(int money) {
        balance += money;
    }
    public void withdraw(int money) throws InsufficientResourcesException {      //호출한 곳으로 예외 떠넘김
        if(balance < money) {
            throw new InsufficientResourcesException("잔고부족: " + (money-balance) + "모자랑");     //예외발생
        }   
        balance -= money;
    }
}
