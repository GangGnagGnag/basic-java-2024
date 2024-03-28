package 은행관리3;

public class Account {
    private String accountNum;
    private String name;
    private int balance;

    public Account(String accountNum, String name, int balance) {
        this.accountNum = accountNum;
        this.name = name;
        this.balance = balance;
    }
    
//    잔고 조회
    public int getBalance(){
        return balance;
    }
    
//    입급하기
    public void deposit(int deposit){
        if(deposit <= 0){
            System.out.println("금액을 확인하세요");
        }
        else {
            balance += deposit;
        }
    }
    
    public void withdraw(int withdraw){
        if(withdraw > balance){
            System.out.println("잔액이 부족합니다");
        }
        else {
            balance -= withdraw;
        }
    }

    public String getAccountNum(){
        return accountNum;
    }
}
