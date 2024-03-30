package 은행2;

public class Account {
    private int acNum;   // 계좌번호
    private String name;    // 예금주
    private int balance;    // 잔액

    public int getAcNum(){
        return acNum;
    }
    public void setAcNum(int acNum) {
        this.acNum = acNum;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void addBalance(int input){
        this.balance += input;
    }
    public void subBalance(int input){
        this.balance -= input;
    }
}
