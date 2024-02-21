package 객체지향.ex2;

public class Account {
    int balace;     //잔액
    void deposit(int amount) {
        balace += amount;
    }

    void withdraw(int amount){
        if(balace >= amount){
            balace -= amount;
        }else {
            System.out.println("잔액이 부족합니다");
        }
    }
}
