package 은행2;

public class Account {
    private String acNum;   // 계좌번호
    private String name;    // 예금주
    private int balance;    // 잔액

    public String getAcNum(){
        return acNum;
    }
    public void setAcNum(String acNum) {
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
}
